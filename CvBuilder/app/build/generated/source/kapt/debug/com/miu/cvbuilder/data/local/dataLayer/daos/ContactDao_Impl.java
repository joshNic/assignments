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
import com.miu.cvbuilder.data.local.dataLayer.entities.ContactTable;
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
public final class ContactDao_Impl implements ContactDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ContactTable> __insertionAdapterOfContactTable;

  private final EntityDeletionOrUpdateAdapter<ContactTable> __deletionAdapterOfContactTable;

  public ContactDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfContactTable = new EntityInsertionAdapter<ContactTable>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `contact_table` (`contactIcn`,`contactType`,`contactValue`,`user`,`userId`,`id`) VALUES (?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ContactTable value) {
        stmt.bindLong(1, value.getContactIcn());
        if (value.getContactType() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getContactType());
        }
        if (value.getContactValue() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getContactValue());
        }
        if (value.getUser() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getUser());
        }
        stmt.bindLong(5, value.getUserId());
        if (value.getId() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getId());
        }
      }
    };
    this.__deletionAdapterOfContactTable = new EntityDeletionOrUpdateAdapter<ContactTable>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `contact_table` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ContactTable value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
      }
    };
  }

  @Override
  public Object insertContact(final ContactTable contact,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfContactTable.insert(contact);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteContact(final ContactTable contact,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfContactTable.handle(contact);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public LiveData<List<ContactTable>> observerAllContacts() {
    final String _sql = "SELECT * FROM contact_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"contact_table"}, false, new Callable<List<ContactTable>>() {
      @Override
      public List<ContactTable> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfContactIcn = CursorUtil.getColumnIndexOrThrow(_cursor, "contactIcn");
          final int _cursorIndexOfContactType = CursorUtil.getColumnIndexOrThrow(_cursor, "contactType");
          final int _cursorIndexOfContactValue = CursorUtil.getColumnIndexOrThrow(_cursor, "contactValue");
          final int _cursorIndexOfUser = CursorUtil.getColumnIndexOrThrow(_cursor, "user");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<ContactTable> _result = new ArrayList<ContactTable>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ContactTable _item;
            final int _tmpContactIcn;
            _tmpContactIcn = _cursor.getInt(_cursorIndexOfContactIcn);
            final String _tmpContactType;
            if (_cursor.isNull(_cursorIndexOfContactType)) {
              _tmpContactType = null;
            } else {
              _tmpContactType = _cursor.getString(_cursorIndexOfContactType);
            }
            final String _tmpContactValue;
            if (_cursor.isNull(_cursorIndexOfContactValue)) {
              _tmpContactValue = null;
            } else {
              _tmpContactValue = _cursor.getString(_cursorIndexOfContactValue);
            }
            final String _tmpUser;
            if (_cursor.isNull(_cursorIndexOfUser)) {
              _tmpUser = null;
            } else {
              _tmpUser = _cursor.getString(_cursorIndexOfUser);
            }
            final int _tmpUserId;
            _tmpUserId = _cursor.getInt(_cursorIndexOfUserId);
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            _item = new ContactTable(_tmpContactIcn,_tmpContactType,_tmpContactValue,_tmpUser,_tmpUserId,_tmpId);
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
  public LiveData<List<ContactTable>> observeContactByUserId(final String userID) {
    final String _sql = "SELECT * FROM contact_table WHERE userId=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (userID == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, userID);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"contact_table"}, false, new Callable<List<ContactTable>>() {
      @Override
      public List<ContactTable> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfContactIcn = CursorUtil.getColumnIndexOrThrow(_cursor, "contactIcn");
          final int _cursorIndexOfContactType = CursorUtil.getColumnIndexOrThrow(_cursor, "contactType");
          final int _cursorIndexOfContactValue = CursorUtil.getColumnIndexOrThrow(_cursor, "contactValue");
          final int _cursorIndexOfUser = CursorUtil.getColumnIndexOrThrow(_cursor, "user");
          final int _cursorIndexOfUserId = CursorUtil.getColumnIndexOrThrow(_cursor, "userId");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<ContactTable> _result = new ArrayList<ContactTable>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final ContactTable _item;
            final int _tmpContactIcn;
            _tmpContactIcn = _cursor.getInt(_cursorIndexOfContactIcn);
            final String _tmpContactType;
            if (_cursor.isNull(_cursorIndexOfContactType)) {
              _tmpContactType = null;
            } else {
              _tmpContactType = _cursor.getString(_cursorIndexOfContactType);
            }
            final String _tmpContactValue;
            if (_cursor.isNull(_cursorIndexOfContactValue)) {
              _tmpContactValue = null;
            } else {
              _tmpContactValue = _cursor.getString(_cursorIndexOfContactValue);
            }
            final String _tmpUser;
            if (_cursor.isNull(_cursorIndexOfUser)) {
              _tmpUser = null;
            } else {
              _tmpUser = _cursor.getString(_cursorIndexOfUser);
            }
            final int _tmpUserId;
            _tmpUserId = _cursor.getInt(_cursorIndexOfUserId);
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            _item = new ContactTable(_tmpContactIcn,_tmpContactType,_tmpContactValue,_tmpUser,_tmpUserId,_tmpId);
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
