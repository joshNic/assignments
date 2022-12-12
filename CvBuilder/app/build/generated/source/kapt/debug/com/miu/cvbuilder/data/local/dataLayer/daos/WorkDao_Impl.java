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
import com.miu.cvbuilder.data.local.dataLayer.entities.WorkTable;
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
public final class WorkDao_Impl implements WorkDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<WorkTable> __insertionAdapterOfWorkTable;

  private final EntityDeletionOrUpdateAdapter<WorkTable> __deletionAdapterOfWorkTable;

  public WorkDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfWorkTable = new EntityInsertionAdapter<WorkTable>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `work_table` (`workImage`,`companyName`,`job`,`from`,`to`,`city`,`state`,`desc`,`userID`,`id`) VALUES (?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, WorkTable value) {
        stmt.bindLong(1, value.getWorkImage());
        if (value.getCompanyName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getCompanyName());
        }
        if (value.getJob() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getJob());
        }
        if (value.getFrom() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getFrom());
        }
        if (value.getTo() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getTo());
        }
        if (value.getCity() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getCity());
        }
        if (value.getState() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getState());
        }
        if (value.getDesc() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getDesc());
        }
        stmt.bindLong(9, value.getUserID());
        if (value.getId() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindLong(10, value.getId());
        }
      }
    };
    this.__deletionAdapterOfWorkTable = new EntityDeletionOrUpdateAdapter<WorkTable>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `work_table` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, WorkTable value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
      }
    };
  }

  @Override
  public Object insertWork(final WorkTable work, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfWorkTable.insert(work);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteWork(final WorkTable work, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfWorkTable.handle(work);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public LiveData<List<WorkTable>> observerAllWorks() {
    final String _sql = "SELECT * FROM work_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"work_table"}, false, new Callable<List<WorkTable>>() {
      @Override
      public List<WorkTable> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfWorkImage = CursorUtil.getColumnIndexOrThrow(_cursor, "workImage");
          final int _cursorIndexOfCompanyName = CursorUtil.getColumnIndexOrThrow(_cursor, "companyName");
          final int _cursorIndexOfJob = CursorUtil.getColumnIndexOrThrow(_cursor, "job");
          final int _cursorIndexOfFrom = CursorUtil.getColumnIndexOrThrow(_cursor, "from");
          final int _cursorIndexOfTo = CursorUtil.getColumnIndexOrThrow(_cursor, "to");
          final int _cursorIndexOfCity = CursorUtil.getColumnIndexOrThrow(_cursor, "city");
          final int _cursorIndexOfState = CursorUtil.getColumnIndexOrThrow(_cursor, "state");
          final int _cursorIndexOfDesc = CursorUtil.getColumnIndexOrThrow(_cursor, "desc");
          final int _cursorIndexOfUserID = CursorUtil.getColumnIndexOrThrow(_cursor, "userID");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<WorkTable> _result = new ArrayList<WorkTable>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final WorkTable _item;
            final int _tmpWorkImage;
            _tmpWorkImage = _cursor.getInt(_cursorIndexOfWorkImage);
            final String _tmpCompanyName;
            if (_cursor.isNull(_cursorIndexOfCompanyName)) {
              _tmpCompanyName = null;
            } else {
              _tmpCompanyName = _cursor.getString(_cursorIndexOfCompanyName);
            }
            final String _tmpJob;
            if (_cursor.isNull(_cursorIndexOfJob)) {
              _tmpJob = null;
            } else {
              _tmpJob = _cursor.getString(_cursorIndexOfJob);
            }
            final String _tmpFrom;
            if (_cursor.isNull(_cursorIndexOfFrom)) {
              _tmpFrom = null;
            } else {
              _tmpFrom = _cursor.getString(_cursorIndexOfFrom);
            }
            final String _tmpTo;
            if (_cursor.isNull(_cursorIndexOfTo)) {
              _tmpTo = null;
            } else {
              _tmpTo = _cursor.getString(_cursorIndexOfTo);
            }
            final String _tmpCity;
            if (_cursor.isNull(_cursorIndexOfCity)) {
              _tmpCity = null;
            } else {
              _tmpCity = _cursor.getString(_cursorIndexOfCity);
            }
            final String _tmpState;
            if (_cursor.isNull(_cursorIndexOfState)) {
              _tmpState = null;
            } else {
              _tmpState = _cursor.getString(_cursorIndexOfState);
            }
            final String _tmpDesc;
            if (_cursor.isNull(_cursorIndexOfDesc)) {
              _tmpDesc = null;
            } else {
              _tmpDesc = _cursor.getString(_cursorIndexOfDesc);
            }
            final int _tmpUserID;
            _tmpUserID = _cursor.getInt(_cursorIndexOfUserID);
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            _item = new WorkTable(_tmpWorkImage,_tmpCompanyName,_tmpJob,_tmpFrom,_tmpTo,_tmpCity,_tmpState,_tmpDesc,_tmpUserID,_tmpId);
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
  public LiveData<List<WorkTable>> observeWorkByUserId(final String userID) {
    final String _sql = "SELECT * FROM work_table WHERE userId=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (userID == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userID);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"work_table"}, false, new Callable<List<WorkTable>>() {
      @Override
      public List<WorkTable> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfWorkImage = CursorUtil.getColumnIndexOrThrow(_cursor, "workImage");
          final int _cursorIndexOfCompanyName = CursorUtil.getColumnIndexOrThrow(_cursor, "companyName");
          final int _cursorIndexOfJob = CursorUtil.getColumnIndexOrThrow(_cursor, "job");
          final int _cursorIndexOfFrom = CursorUtil.getColumnIndexOrThrow(_cursor, "from");
          final int _cursorIndexOfTo = CursorUtil.getColumnIndexOrThrow(_cursor, "to");
          final int _cursorIndexOfCity = CursorUtil.getColumnIndexOrThrow(_cursor, "city");
          final int _cursorIndexOfState = CursorUtil.getColumnIndexOrThrow(_cursor, "state");
          final int _cursorIndexOfDesc = CursorUtil.getColumnIndexOrThrow(_cursor, "desc");
          final int _cursorIndexOfUserID = CursorUtil.getColumnIndexOrThrow(_cursor, "userID");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<WorkTable> _result = new ArrayList<WorkTable>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final WorkTable _item;
            final int _tmpWorkImage;
            _tmpWorkImage = _cursor.getInt(_cursorIndexOfWorkImage);
            final String _tmpCompanyName;
            if (_cursor.isNull(_cursorIndexOfCompanyName)) {
              _tmpCompanyName = null;
            } else {
              _tmpCompanyName = _cursor.getString(_cursorIndexOfCompanyName);
            }
            final String _tmpJob;
            if (_cursor.isNull(_cursorIndexOfJob)) {
              _tmpJob = null;
            } else {
              _tmpJob = _cursor.getString(_cursorIndexOfJob);
            }
            final String _tmpFrom;
            if (_cursor.isNull(_cursorIndexOfFrom)) {
              _tmpFrom = null;
            } else {
              _tmpFrom = _cursor.getString(_cursorIndexOfFrom);
            }
            final String _tmpTo;
            if (_cursor.isNull(_cursorIndexOfTo)) {
              _tmpTo = null;
            } else {
              _tmpTo = _cursor.getString(_cursorIndexOfTo);
            }
            final String _tmpCity;
            if (_cursor.isNull(_cursorIndexOfCity)) {
              _tmpCity = null;
            } else {
              _tmpCity = _cursor.getString(_cursorIndexOfCity);
            }
            final String _tmpState;
            if (_cursor.isNull(_cursorIndexOfState)) {
              _tmpState = null;
            } else {
              _tmpState = _cursor.getString(_cursorIndexOfState);
            }
            final String _tmpDesc;
            if (_cursor.isNull(_cursorIndexOfDesc)) {
              _tmpDesc = null;
            } else {
              _tmpDesc = _cursor.getString(_cursorIndexOfDesc);
            }
            final int _tmpUserID;
            _tmpUserID = _cursor.getInt(_cursorIndexOfUserID);
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            _item = new WorkTable(_tmpWorkImage,_tmpCompanyName,_tmpJob,_tmpFrom,_tmpTo,_tmpCity,_tmpState,_tmpDesc,_tmpUserID,_tmpId);
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
