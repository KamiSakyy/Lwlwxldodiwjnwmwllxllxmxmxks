package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.m8;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n extends SQLiteOpenHelper {
    public final /* synthetic */ int r;
    public final /* synthetic */ androidx.compose.foundation.lazy.layout.s0 s;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(o oVar, Context context) {
        this(context, "google_app_measurement.db");
        this.r = 0;
        this.s = oVar;
    }

    private final void f(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void m(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void r(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    private final void t(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        switch (this.r) {
            case 0:
                o oVar = (o) this.s;
                o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) oVar).s;
                o1 o1Var2 = (o1) ((androidx.compose.foundation.lazy.layout.s0) oVar).s;
                o1Var.getClass();
                ba.c cVar = oVar.w;
                if (cVar.s != 0) {
                    ((g21.a) cVar.t).getClass();
                    if (SystemClock.elapsedRealtime() - cVar.s < 3600000) {
                        throw new SQLiteException("Database open failed");
                    }
                }
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteException unused) {
                    ((g21.a) cVar.t).getClass();
                    cVar.s = SystemClock.elapsedRealtime();
                    s0 s0Var = o1Var2.w;
                    o1.m(s0Var);
                    s0Var.x.a("Opening the database failed, dropping and recreating it");
                    if (!o1Var2.r.getDatabasePath("google_app_measurement.db").delete()) {
                        s0 s0Var2 = o1Var2.w;
                        o1.m(s0Var2);
                        s0Var2.x.b("google_app_measurement.db", "Failed to delete corrupted db file");
                    }
                    try {
                        SQLiteDatabase writableDatabase = super.getWritableDatabase();
                        cVar.s = 0L;
                        return writableDatabase;
                    } catch (SQLiteException e) {
                        s0 s0Var3 = o1Var2.w;
                        o1.m(s0Var3);
                        s0Var3.x.b(e, "Failed to open freshly created database");
                        throw e;
                    }
                }
            default:
                m0 m0Var = (m0) this.s;
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseLockedException e2) {
                    throw e2;
                } catch (SQLiteException unused2) {
                    o1 o1Var3 = (o1) ((androidx.compose.foundation.lazy.layout.s0) m0Var).s;
                    s0 s0Var4 = o1Var3.w;
                    o1.m(s0Var4);
                    s0Var4.x.a("Opening the local database failed, dropping and recreating it");
                    if (!o1Var3.r.getDatabasePath("google_app_measurement_local.db").delete()) {
                        s0 s0Var5 = o1Var3.w;
                        o1.m(s0Var5);
                        s0Var5.x.b("google_app_measurement_local.db", "Failed to delete corrupted local db file");
                    }
                    try {
                        return super.getWritableDatabase();
                    } catch (SQLiteException e3) {
                        s0 s0Var6 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) m0Var).s).w;
                        o1.m(s0Var6);
                        s0Var6.x.b(e3, "Failed to open local database. Events will bypass local storage");
                        return null;
                    }
                }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        switch (this.r) {
            case 0:
                s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) ((o) this.s)).s).w;
                o1.m(s0Var);
                c2.f(s0Var, sQLiteDatabase);
                break;
            default:
                s0 s0Var2 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) ((m0) this.s)).s).w;
                o1.m(s0Var2);
                c2.f(s0Var2, sQLiteDatabase);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = this.r;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        switch (this.r) {
            case 0:
                o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) ((o) this.s)).s;
                s0 s0Var = o1Var.w;
                o1.m(s0Var);
                c2.d(s0Var, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", o.x);
                s0 s0Var2 = o1Var.w;
                o1.m(s0Var2);
                c2.d(s0Var2, sQLiteDatabase, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", null);
                o1.m(s0Var2);
                c2.d(s0Var2, sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
                o1.m(s0Var2);
                c2.d(s0Var2, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", o.z);
                o1.m(s0Var2);
                c2.d(s0Var2, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", o.A);
                o1.m(s0Var2);
                c2.d(s0Var2, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", o.C);
                o1.m(s0Var2);
                c2.d(s0Var2, sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
                o1.m(s0Var2);
                c2.d(s0Var2, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", o.B);
                o1.m(s0Var2);
                c2.d(s0Var2, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", o.D);
                o1.m(s0Var2);
                c2.d(s0Var2, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", o.E);
                o1.m(s0Var2);
                c2.d(s0Var2, sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
                o1.m(s0Var2);
                c2.d(s0Var2, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", o.F);
                o1.m(s0Var2);
                c2.d(s0Var2, sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
                o1.m(s0Var2);
                c2.d(s0Var2, sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
                o1.m(s0Var2);
                c2.d(s0Var2, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", o.G);
                m8.a();
                o1.m(s0Var2);
                c2.d(s0Var2, sQLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", o.H);
                o1.m(s0Var2);
                c2.d(s0Var2, sQLiteDatabase, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", o.y);
                o1.m(s0Var2);
                c2.d(s0Var2, sQLiteDatabase, "no_data_mode_events", "CREATE TABLE IF NOT EXISTS no_data_mode_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, data BLOB NOT NULL, timestamp_millis INTEGER NOT NULL);", "app_id,name,data,timestamp_millis", null);
                break;
            default:
                s0 s0Var3 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) ((m0) this.s)).s).w;
                o1.m(s0Var3);
                c2.d(s0Var3, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", m0.w);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = this.r;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(m0 m0Var, Context context) {
        this(context, "google_app_measurement_local.db");
        this.r = 1;
        this.s = m0Var;
    }

    public n(Context context, String str) {
        super(context, true == str.equals("") ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
    }
}
