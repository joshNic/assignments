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
import com.miu.cvbuilder.data.local.dataLayer.entities.EducationTable;
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
public final class EducationDao_Impl implements EducationDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<EducationTable> __insertionAdapterOfEducationTable;

  private final EntityDeletionOrUpdateAdapter<EducationTable> __deletionAdapterOfEducationTable;

  public EducationDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfEducationTable = new EntityInsertionAdapter<EducationTable>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `education_table` (`collageImage`,`collegeName`,`major`,`userId`,`id`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, EducationTable value) {
        stmt.bindLong(1, value.getCollageImage());
        if (value.getCollegeName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCollegeName());
        }
        if (value.getMajor() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getMajor());
        }
        stmt.bindLong(4, value.getUserId());
        if (value.getId() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, value.getId());
        }
      }
    };
    this.__deletionAdapterOfEducationTable = new EntityDeletionOrUpdateAdapter<EducationTable>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `education_table` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, EducationTable value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
      }
    };
  }

  @Override
  public Object insertEducation(final EducationTable education,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfEducationTable.insert(education);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteEducation(final EducationTable education,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfEducationTable.handle(education);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public LiveData<List<EducationTable>> observerAllEducations() {
    final String _sql = "SELECT * FROM education_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"education_table"}, false, new Callable<List<EducationTable>>() {
      @Override
      public List<EducationTable> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCollageImage = CursorUtil.getColumnIndexOrThrow(_cursor, "collageImage");
          final int _cursorIndexOfCollegeName = CursorUtil.getColumnIndexOrThrow(_cursor, "collegeName");
          final int _cursorIndexOfMajor = CursorUtil.getColumnIndexOrThrow(_cursor, "major");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<EducationTable> _result = new ArrayList<EducationTable>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final EducationTable _item;
            final int _tmpCollageImage;
            _tmpCollageImage = _cursor.getInt(_cursorIndexOfCollageImage);
            final String _tmpCollegeName;
            if (_cursor.isNull(_cursorIndexOfCollegeName)) {
              _tmpCollegeName = null;
            } else {
              _tmpCollegeName = _cursor.getString(_cursorIndexOfCollegeName);
            }
            final String _tmpMajor;
            if (_cursor.isNull(_cursorIndexOfMajor)) {
              _tmpMajor = null;
            } else {
              _tmpMajor = _cursor.getString(_cursorIndexOfMajor);
            }
            final int _tmpUserId;
            _tmpUserId = _cursor.getInt(_cursorIndexOfUserId);
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            _item = new EducationTable(_tmpCollageImage,_tmpCollegeName,_tmpMajor,_tmpUserId,_tmpId);
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
  public LiveData<List<EducationTable>> observeEducationByUserId(final String userID) {
    final String _sql = "SELECT * FROM education_table WHERE userId=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (userID == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userID);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"education_table"}, false, new Callable<List<EducationTable>>() {
      @Override
      public List<EducationTable> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfCollageImage = CursorUtil.getColumnIndexOrThrow(_cursor, "collageImage");
          final int _cursorIndexOfCollegeName = CursorUtil.getColumnIndexOrThrow(_cursor, "collegeName");
          final int _cursorIndexOfMajor = CursorUtil.getColumnIndexOrThrow(_cursor, "major");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<EducationTable> _result = new ArrayList<EducationTable>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final EducationTable _item;
            final int _tmpCollageImage;
            _tmpCollageImage = _cursor.getInt(_cursorIndexOfCollageImage);
            final String _tmpCollegeName;
            if (_cursor.isNull(_cursorIndexOfCollegeName)) {
              _tmpCollegeName = null;
            } else {
              _tmpCollegeName = _cursor.getString(_cursorIndexOfCollegeName);
            }
            final String _tmpMajor;
            if (_cursor.isNull(_cursorIndexOfMajor)) {
              _tmpMajor = null;
            } else {
              _tmpMajor = _cursor.getString(_cursorIndexOfMajor);
            }
            final int _tmpUserId;
            _tmpUserId = _cursor.getInt(_cursorIndexOfUserId);
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            _item = new EducationTable(_tmpCollageImage,_tmpCollegeName,_tmpMajor,_tmpUserId,_tmpId);
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
