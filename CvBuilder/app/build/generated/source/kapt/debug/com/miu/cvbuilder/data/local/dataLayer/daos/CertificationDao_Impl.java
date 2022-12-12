package com.miu.cvbuilder.data.local.dataLayer.daos;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.miu.cvbuilder.data.local.dataLayer.entities.CertificationTable;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CertificationDao_Impl implements CertificationDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<CertificationTable> __insertionAdapterOfCertificationTable;

  private final EntityDeletionOrUpdateAdapter<CertificationTable> __deletionAdapterOfCertificationTable;

  public CertificationDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCertificationTable = new EntityInsertionAdapter<CertificationTable>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `certification_table` (`certificationImage`,`certificationName`,`yearAttended`,`userId`,`id`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CertificationTable value) {
        stmt.bindLong(1, value.getCertificationImage());
        if (value.getCertificationName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCertificationName());
        }
        if (value.getYearAttended() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getYearAttended());
        }
        stmt.bindLong(4, value.getUserId());
        if (value.getId() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, value.getId());
        }
      }
    };
    this.__deletionAdapterOfCertificationTable = new EntityDeletionOrUpdateAdapter<CertificationTable>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `certification_table` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CertificationTable value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
      }
    };
  }

  @Override
  public Object insertCertificate(final CertificationTable certificate,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfCertificationTable.insert(certificate);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteCertificate(final CertificationTable certificate,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfCertificationTable.handle(certificate);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public LiveData<List<CertificationTable>> observerAllCertificates() {
    final String _sql = "SELECT * FROM certification_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"certification_table"}, false, new Callable<List<CertificationTable>>() {
      @Override
      public List<CertificationTable> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCertificationImage = CursorUtil.getColumnIndexOrThrow(_cursor, "certificationImage");
          final int _cursorIndexOfCertificationName = CursorUtil.getColumnIndexOrThrow(_cursor, "certificationName");
          final int _cursorIndexOfYearAttended = CursorUtil.getColumnIndexOrThrow(_cursor, "yearAttended");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<CertificationTable> _result = new ArrayList<CertificationTable>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final CertificationTable _item;
            final int _tmpCertificationImage;
            _tmpCertificationImage = _cursor.getInt(_cursorIndexOfCertificationImage);
            final String _tmpCertificationName;
            if (_cursor.isNull(_cursorIndexOfCertificationName)) {
              _tmpCertificationName = null;
            } else {
              _tmpCertificationName = _cursor.getString(_cursorIndexOfCertificationName);
            }
            final String _tmpYearAttended;
            if (_cursor.isNull(_cursorIndexOfYearAttended)) {
              _tmpYearAttended = null;
            } else {
              _tmpYearAttended = _cursor.getString(_cursorIndexOfYearAttended);
            }
            final int _tmpUserId;
            _tmpUserId = _cursor.getInt(_cursorIndexOfUserId);
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            _item = new CertificationTable(_tmpCertificationImage,_tmpCertificationName,_tmpYearAttended,_tmpUserId,_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<CertificationTable>> observeCertificationByUserId(final String userID) {
    final String _sql = "SELECT * FROM certification_table WHERE userId=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (userID == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userID);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"certification_table"}, false, new Callable<List<CertificationTable>>() {
      @Override
      public List<CertificationTable> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCertificationImage = CursorUtil.getColumnIndexOrThrow(_cursor, "certificationImage");
          final int _cursorIndexOfCertificationName = CursorUtil.getColumnIndexOrThrow(_cursor, "certificationName");
          final int _cursorIndexOfYearAttended = CursorUtil.getColumnIndexOrThrow(_cursor, "yearAttended");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<CertificationTable> _result = new ArrayList<CertificationTable>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final CertificationTable _item;
            final int _tmpCertificationImage;
            _tmpCertificationImage = _cursor.getInt(_cursorIndexOfCertificationImage);
            final String _tmpCertificationName;
            if (_cursor.isNull(_cursorIndexOfCertificationName)) {
              _tmpCertificationName = null;
            } else {
              _tmpCertificationName = _cursor.getString(_cursorIndexOfCertificationName);
            }
            final String _tmpYearAttended;
            if (_cursor.isNull(_cursorIndexOfYearAttended)) {
              _tmpYearAttended = null;
            } else {
              _tmpYearAttended = _cursor.getString(_cursorIndexOfYearAttended);
            }
            final int _tmpUserId;
            _tmpUserId = _cursor.getInt(_cursorIndexOfUserId);
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            _item = new CertificationTable(_tmpCertificationImage,_tmpCertificationName,_tmpYearAttended,_tmpUserId,_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
