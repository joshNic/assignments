package com.miu.cvbuilder.data.local.dataLayer;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

import com.miu.cvbuilder.data.local.dataLayer.daos.CertificationDao;
import com.miu.cvbuilder.data.local.dataLayer.daos.CertificationDao_Impl;
import com.miu.cvbuilder.data.local.dataLayer.daos.ContactDao;
import com.miu.cvbuilder.data.local.dataLayer.daos.ContactDao_Impl;
import com.miu.cvbuilder.data.local.dataLayer.daos.EducationDao;
import com.miu.cvbuilder.data.local.dataLayer.daos.EducationDao_Impl;
import com.miu.cvbuilder.data.local.dataLayer.daos.UserDao;
import com.miu.cvbuilder.data.local.dataLayer.daos.UserDao_Impl;
import com.miu.cvbuilder.data.local.dataLayer.daos.WorkDao;
import com.miu.cvbuilder.data.local.dataLayer.daos.WorkDao_Impl;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CvDatabase_Impl extends CvDatabase {
  private volatile UserDao _userDao;

  private volatile ContactDao _contactDao;

  private volatile EducationDao _educationDao;

  private volatile WorkDao _workDao;

  private volatile CertificationDao _certificationDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `certification_table` (`certificationImage` INTEGER NOT NULL, `certificationName` TEXT NOT NULL, `yearAttended` TEXT NOT NULL, `userId` INTEGER NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `contact_table` (`contactIcn` INTEGER NOT NULL, `contactType` TEXT NOT NULL, `contactValue` TEXT NOT NULL, `user` TEXT NOT NULL, `userId` INTEGER NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `education_table` (`collageImage` INTEGER NOT NULL, `collegeName` TEXT NOT NULL, `major` TEXT NOT NULL, `userId` INTEGER NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `work_table` (`workImage` INTEGER NOT NULL, `companyName` TEXT NOT NULL, `job` TEXT NOT NULL, `from` TEXT NOT NULL, `to` TEXT NOT NULL, `city` TEXT NOT NULL, `state` TEXT NOT NULL, `desc` TEXT NOT NULL, `userID` INTEGER NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `user` (`userName` TEXT NOT NULL, `password` TEXT NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'a412d4280542858cc71034d0920a058c')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `certification_table`");
        _db.execSQL("DROP TABLE IF EXISTS `contact_table`");
        _db.execSQL("DROP TABLE IF EXISTS `education_table`");
        _db.execSQL("DROP TABLE IF EXISTS `work_table`");
        _db.execSQL("DROP TABLE IF EXISTS `user`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsCertificationTable = new HashMap<String, TableInfo.Column>(5);
        _columnsCertificationTable.put("certificationImage", new TableInfo.Column("certificationImage", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCertificationTable.put("certificationName", new TableInfo.Column("certificationName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCertificationTable.put("yearAttended", new TableInfo.Column("yearAttended", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCertificationTable.put("userId", new TableInfo.Column("userId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCertificationTable.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCertificationTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCertificationTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCertificationTable = new TableInfo("certification_table", _columnsCertificationTable, _foreignKeysCertificationTable, _indicesCertificationTable);
        final TableInfo _existingCertificationTable = TableInfo.read(_db, "certification_table");
        if (! _infoCertificationTable.equals(_existingCertificationTable)) {
          return new RoomOpenHelper.ValidationResult(false, "certification_table(com.ktn.cvbuilder.data.local.dataLayer.entities.CertificationTable).\n"
                  + " Expected:\n" + _infoCertificationTable + "\n"
                  + " Found:\n" + _existingCertificationTable);
        }
        final HashMap<String, TableInfo.Column> _columnsContactTable = new HashMap<String, TableInfo.Column>(6);
        _columnsContactTable.put("contactIcn", new TableInfo.Column("contactIcn", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsContactTable.put("contactType", new TableInfo.Column("contactType", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsContactTable.put("contactValue", new TableInfo.Column("contactValue", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsContactTable.put("user", new TableInfo.Column("user", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsContactTable.put("userId", new TableInfo.Column("userId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsContactTable.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysContactTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesContactTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoContactTable = new TableInfo("contact_table", _columnsContactTable, _foreignKeysContactTable, _indicesContactTable);
        final TableInfo _existingContactTable = TableInfo.read(_db, "contact_table");
        if (! _infoContactTable.equals(_existingContactTable)) {
          return new RoomOpenHelper.ValidationResult(false, "contact_table(com.ktn.cvbuilder.data.local.dataLayer.entities.ContactTable).\n"
                  + " Expected:\n" + _infoContactTable + "\n"
                  + " Found:\n" + _existingContactTable);
        }
        final HashMap<String, TableInfo.Column> _columnsEducationTable = new HashMap<String, TableInfo.Column>(5);
        _columnsEducationTable.put("collageImage", new TableInfo.Column("collageImage", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducationTable.put("collegeName", new TableInfo.Column("collegeName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducationTable.put("major", new TableInfo.Column("major", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducationTable.put("userId", new TableInfo.Column("userId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEducationTable.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysEducationTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesEducationTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoEducationTable = new TableInfo("education_table", _columnsEducationTable, _foreignKeysEducationTable, _indicesEducationTable);
        final TableInfo _existingEducationTable = TableInfo.read(_db, "education_table");
        if (! _infoEducationTable.equals(_existingEducationTable)) {
          return new RoomOpenHelper.ValidationResult(false, "education_table(com.ktn.cvbuilder.data.local.dataLayer.entities.EducationTable).\n"
                  + " Expected:\n" + _infoEducationTable + "\n"
                  + " Found:\n" + _existingEducationTable);
        }
        final HashMap<String, TableInfo.Column> _columnsWorkTable = new HashMap<String, TableInfo.Column>(10);
        _columnsWorkTable.put("workImage", new TableInfo.Column("workImage", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWorkTable.put("companyName", new TableInfo.Column("companyName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWorkTable.put("job", new TableInfo.Column("job", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWorkTable.put("from", new TableInfo.Column("from", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWorkTable.put("to", new TableInfo.Column("to", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWorkTable.put("city", new TableInfo.Column("city", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWorkTable.put("state", new TableInfo.Column("state", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWorkTable.put("desc", new TableInfo.Column("desc", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWorkTable.put("userID", new TableInfo.Column("userID", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsWorkTable.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysWorkTable = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesWorkTable = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoWorkTable = new TableInfo("work_table", _columnsWorkTable, _foreignKeysWorkTable, _indicesWorkTable);
        final TableInfo _existingWorkTable = TableInfo.read(_db, "work_table");
        if (! _infoWorkTable.equals(_existingWorkTable)) {
          return new RoomOpenHelper.ValidationResult(false, "work_table(com.ktn.cvbuilder.data.local.dataLayer.entities.WorkTable).\n"
                  + " Expected:\n" + _infoWorkTable + "\n"
                  + " Found:\n" + _existingWorkTable);
        }
        final HashMap<String, TableInfo.Column> _columnsUser = new HashMap<String, TableInfo.Column>(3);
        _columnsUser.put("userName", new TableInfo.Column("userName", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("password", new TableInfo.Column("password", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUser.put("id", new TableInfo.Column("id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUser = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUser = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUser = new TableInfo("user", _columnsUser, _foreignKeysUser, _indicesUser);
        final TableInfo _existingUser = TableInfo.read(_db, "user");
        if (! _infoUser.equals(_existingUser)) {
          return new RoomOpenHelper.ValidationResult(false, "user(com.ktn.cvbuilder.data.local.dataLayer.entities.UserTable).\n"
                  + " Expected:\n" + _infoUser + "\n"
                  + " Found:\n" + _existingUser);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "a412d4280542858cc71034d0920a058c", "9ab8ea85fb559cc8851555fe685da995");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "certification_table","contact_table","education_table","work_table","user");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `certification_table`");
      _db.execSQL("DELETE FROM `contact_table`");
      _db.execSQL("DELETE FROM `education_table`");
      _db.execSQL("DELETE FROM `work_table`");
      _db.execSQL("DELETE FROM `user`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(UserDao.class, UserDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(ContactDao.class, ContactDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(EducationDao.class, EducationDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(WorkDao.class, WorkDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(CertificationDao.class, CertificationDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public UserDao userDao() {
    if (_userDao != null) {
      return _userDao;
    } else {
      synchronized(this) {
        if(_userDao == null) {
          _userDao = new UserDao_Impl(this);
        }
        return _userDao;
      }
    }
  }

  @Override
  public ContactDao contactDao() {
    if (_contactDao != null) {
      return _contactDao;
    } else {
      synchronized(this) {
        if(_contactDao == null) {
          _contactDao = new ContactDao_Impl(this);
        }
        return _contactDao;
      }
    }
  }

  @Override
  public EducationDao educationDao() {
    if (_educationDao != null) {
      return _educationDao;
    } else {
      synchronized(this) {
        if(_educationDao == null) {
          _educationDao = new EducationDao_Impl(this);
        }
        return _educationDao;
      }
    }
  }

  @Override
  public WorkDao workDao() {
    if (_workDao != null) {
      return _workDao;
    } else {
      synchronized(this) {
        if(_workDao == null) {
          _workDao = new WorkDao_Impl(this);
        }
        return _workDao;
      }
    }
  }

  @Override
  public CertificationDao certificationDao() {
    if (_certificationDao != null) {
      return _certificationDao;
    } else {
      synchronized(this) {
        if(_certificationDao == null) {
          _certificationDao = new CertificationDao_Impl(this);
        }
        return _certificationDao;
      }
    }
  }
}
