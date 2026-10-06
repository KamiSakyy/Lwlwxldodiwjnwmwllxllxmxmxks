package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m0 extends e0 {
    public static final String[] w = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};
    public n u;
    public boolean v;

    public m0(o1 o1Var) {
        super(o1Var);
        this.u = new n(this, ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).r);
    }

    @Override // com.google.android.gms.measurement.internal.e0
    public final boolean C() {
        return false;
    }

    public final void D() {
        int delete;
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        z();
        try {
            SQLiteDatabase F = F();
            if (F == null || (delete = F.delete("messages", null, null)) <= 0) {
                return;
            }
            s0 s0Var = o1Var.w;
            o1.m(s0Var);
            s0Var.F.b(Integer.valueOf(delete), "Reset local analytics data. records");
        } catch (SQLiteException e) {
            s0 s0Var2 = o1Var.w;
            o1.m(s0Var2);
            s0Var2.x.b(e, "Error resetting local analytics data. error");
        }
    }

    public final boolean E() {
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        z();
        if (!this.v && o1Var.r.getDatabasePath("google_app_measurement_local.db").exists()) {
            int i = 5;
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    s0 s0Var = o1Var.w;
                    o1.m(s0Var);
                    s0Var.A.a("Error deleting app launch break from local database in reasonable time");
                    break;
                }
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        SQLiteDatabase F = F();
                        if (F != null) {
                            F.beginTransaction();
                            F.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                            F.setTransactionSuccessful();
                            F.endTransaction();
                            F.close();
                            return true;
                        }
                        this.v = true;
                    } catch (SQLiteException e) {
                        if (0 != 0) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Throwable th) {
                                if (0 != 0) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        }
                        s0 s0Var2 = o1Var.w;
                        o1.m(s0Var2);
                        s0Var2.x.b(e, "Error deleting app launch break from local database");
                        this.v = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i);
                    i += 20;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                } catch (SQLiteFullException e2) {
                    s0 s0Var3 = o1Var.w;
                    o1.m(s0Var3);
                    s0Var3.x.b(e2, "Error deleting app launch break from local database");
                    this.v = true;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                }
                i2++;
            }
        }
        return false;
    }

    public final SQLiteDatabase F() {
        if (this.v) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.u.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.v = true;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0120 A[Catch: all -> 0x0154, TRY_ENTER, TryCatch #10 {all -> 0x0154, blocks: (B:95:0x0088, B:97:0x008e, B:65:0x00ae, B:67:0x00cf, B:70:0x00d8, B:73:0x00de, B:74:0x00f8, B:42:0x0120, B:44:0x0126, B:45:0x0129, B:33:0x015b, B:21:0x0144), top: B:94:0x0088 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean G(int i, byte[] bArr) {
        SQLiteDatabase sQLiteDatabase;
        boolean z;
        boolean z2;
        Cursor cursor;
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        z();
        boolean z3 = false;
        z3 = false;
        if (!this.v) {
            h hVar = o1Var.u;
            s0 s0Var = o1Var.w;
            b0 b0Var = c0.b1;
            Cursor cursor2 = null;
            v4 D = hVar.J(null, b0Var) ? o1Var.r().D(null) : null;
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(i));
            contentValues.put("entry", bArr);
            if (o1Var.u.J(null, b0Var) && D != null) {
                contentValues.put("app_version", D.t);
                contentValues.put("app_version_int", Long.valueOf(D.A));
            }
            int i2 = 5;
            int i3 = 0;
            for (int i4 = 5; i3 < i4; i4 = 5) {
                try {
                    sQLiteDatabase = F();
                    if (sQLiteDatabase == null) {
                        this.v = true;
                    } else {
                        try {
                            sQLiteDatabase.beginTransaction();
                            cursor = sQLiteDatabase.rawQuery("select count(1) from messages", null);
                            long j = 0;
                            if (cursor != null) {
                                try {
                                    try {
                                        if (cursor.moveToFirst()) {
                                            j = cursor.getLong(z3 ? 1 : 0);
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        cursor2 = cursor;
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteDatabaseLockedException unused) {
                                    z = z3 ? 1 : 0;
                                    SystemClock.sleep(i2);
                                    i2 += 20;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i3++;
                                    z3 = z;
                                } catch (SQLiteFullException e) {
                                    e = e;
                                    z = z3 ? 1 : 0;
                                    o1.m(s0Var);
                                    s0Var.x.b(e, "Error writing entry; local database full");
                                    this.v = true;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i3++;
                                    z3 = z;
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    z = z3 ? 1 : 0;
                                    z2 = true;
                                    if (sQLiteDatabase != null) {
                                    }
                                    o1.m(s0Var);
                                    s0Var.x.b(e, "Error writing entry to local database");
                                    this.v = z2;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i3++;
                                    z3 = z;
                                }
                            }
                            if (j >= 100000) {
                                o1.m(s0Var);
                                s0Var.x.a("Data loss, local db full");
                                long j2 = 100001 - j;
                                long delete = sQLiteDatabase.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j2)});
                                if (delete != j2) {
                                    o1.m(s0Var);
                                    q0 q0Var = s0Var.x;
                                    z = z3 ? 1 : 0;
                                    try {
                                        try {
                                            z2 = true;
                                        } catch (SQLiteDatabaseLockedException unused2) {
                                            SystemClock.sleep(i2);
                                            i2 += 20;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            if (sQLiteDatabase == null) {
                                                i3++;
                                                z3 = z;
                                            }
                                            sQLiteDatabase.close();
                                            i3++;
                                            z3 = z;
                                        }
                                    } catch (SQLiteFullException e3) {
                                        e = e3;
                                        o1.m(s0Var);
                                        s0Var.x.b(e, "Error writing entry; local database full");
                                        this.v = true;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabase == null) {
                                            i3++;
                                            z3 = z;
                                        }
                                        sQLiteDatabase.close();
                                        i3++;
                                        z3 = z;
                                    } catch (SQLiteException e4) {
                                        e = e4;
                                        z2 = true;
                                        if (sQLiteDatabase != null && sQLiteDatabase.inTransaction()) {
                                            sQLiteDatabase.endTransaction();
                                        }
                                        o1.m(s0Var);
                                        s0Var.x.b(e, "Error writing entry to local database");
                                        this.v = z2;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabase == null) {
                                            i3++;
                                            z3 = z;
                                        }
                                        sQLiteDatabase.close();
                                        i3++;
                                        z3 = z;
                                    }
                                    try {
                                        q0Var.d("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(delete), Long.valueOf(j2 - delete));
                                        sQLiteDatabase.insertOrThrow("messages", null, contentValues);
                                        sQLiteDatabase.setTransactionSuccessful();
                                        sQLiteDatabase.endTransaction();
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        sQLiteDatabase.close();
                                        return z2;
                                    } catch (SQLiteFullException e5) {
                                        e = e5;
                                        o1.m(s0Var);
                                        s0Var.x.b(e, "Error writing entry; local database full");
                                        this.v = true;
                                        if (cursor != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                        i3++;
                                        z3 = z;
                                    } catch (SQLiteException e6) {
                                        e = e6;
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.endTransaction();
                                        }
                                        o1.m(s0Var);
                                        s0Var.x.b(e, "Error writing entry to local database");
                                        this.v = z2;
                                        if (cursor != null) {
                                        }
                                        if (sQLiteDatabase == null) {
                                        }
                                        sQLiteDatabase.close();
                                        i3++;
                                        z3 = z;
                                    }
                                }
                            }
                            z = z3 ? 1 : 0;
                            z2 = true;
                            sQLiteDatabase.insertOrThrow("messages", null, contentValues);
                            sQLiteDatabase.setTransactionSuccessful();
                            sQLiteDatabase.endTransaction();
                            if (cursor != null) {
                            }
                            sQLiteDatabase.close();
                            return z2;
                        } catch (SQLiteDatabaseLockedException unused3) {
                            z = z3 ? 1 : 0;
                            cursor = null;
                        } catch (SQLiteFullException e7) {
                            e = e7;
                            z = z3 ? 1 : 0;
                            cursor = null;
                        } catch (SQLiteException e8) {
                            e = e8;
                            z = z3 ? 1 : 0;
                            z2 = true;
                            cursor = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused4) {
                    z = z3 ? 1 : 0;
                    sQLiteDatabase = null;
                    cursor = null;
                } catch (SQLiteFullException e9) {
                    e = e9;
                    z = z3 ? 1 : 0;
                    sQLiteDatabase = null;
                    cursor = null;
                } catch (SQLiteException e10) {
                    e = e10;
                    z = z3 ? 1 : 0;
                    z2 = true;
                    sQLiteDatabase = null;
                    cursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteDatabase = null;
                }
            }
            boolean z4 = z3 ? 1 : 0;
            o1.m(s0Var);
            s0Var.F.a("Failed to write entry to local database");
            return z4;
        }
        return z3;
    }
}
