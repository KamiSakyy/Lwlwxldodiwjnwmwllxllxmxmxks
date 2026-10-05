package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.m5;
import com.google.android.gms.internal.measurement.m8;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o extends i4 {
    public final n v;
    public final ba.c w;
    public static final String[] x = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    public static final String[] y = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};
    public static final String[] z = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};
    public static final String[] A = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;"};
    public static final String[] B = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};
    public static final String[] C = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    public static final String[] D = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] E = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};
    public static final String[] F = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};
    public static final String[] G = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};
    public static final String[] H = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    public o(o4 o4Var) {
        super(o4Var);
        this.w = new ba.c(((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).B);
        ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).getClass();
        this.v = new n(this, ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).r);
    }

    public static final String c0(List list) {
        return list.isEmpty() ? "" : f1.e.z(" AND (upload_type IN (", TextUtils.join(", ", list), "))");
    }

    public static final void i0(ContentValues contentValues, Object obj) {
        c21.u.d("value");
        c21.u.g(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        r3 = r2.w;
        com.google.android.gms.measurement.internal.o1.m(r3);
        r3.x.b(1000, "Read more than the max allowed conditional properties, ignoring extra");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List A0(String str, String[] strArr) {
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        z();
        A();
        ?? arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                o1Var.getClass();
                cursor = o0().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, null, null, "rowid", "1001");
                if (cursor.moveToFirst()) {
                    while (true) {
                        if (arrayList.size() >= 1000) {
                            break;
                        }
                        String string = cursor.getString(0);
                        String string2 = cursor.getString(1);
                        String string3 = cursor.getString(2);
                        Object M = M(cursor, 3);
                        boolean z2 = cursor.getInt(4) != 0;
                        String string4 = cursor.getString(5);
                        long j = cursor.getLong(6);
                        w0 w0Var = this.t.x;
                        o4.U(w0Var);
                        byte[] blob = cursor.getBlob(7);
                        Parcelable.Creator<w> creator = w.CREATOR;
                        w wVar = (w) w0Var.e0(blob, creator);
                        long j2 = cursor.getLong(8);
                        o4.U(w0Var);
                        w wVar2 = (w) w0Var.e0(cursor.getBlob(9), creator);
                        long j3 = cursor.getLong(10);
                        long j4 = cursor.getLong(11);
                        o4.U(w0Var);
                        arrayList.add(new f(string, string2, new q4(j3, M, string3, string2), j2, z2, string4, wVar, j, wVar2, j4, (w) w0Var.e0(cursor.getBlob(12), creator)));
                        if (!cursor.moveToNext()) {
                            break;
                        }
                    }
                }
            } catch (SQLiteException e) {
                s0 s0Var = o1Var.w;
                o1.m(s0Var);
                s0Var.x.b(e, "Error querying conditional user property value");
                arrayList = Collections.EMPTY_LIST;
            }
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x03e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final x0 B0(String str) {
        Cursor cursor;
        Boolean valueOf;
        String string;
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        c21.u.d(str);
        z();
        A();
        Cursor cursor2 = null;
        try {
            cursor = o0().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info", "client_upload_eligibility"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                } catch (SQLiteException e) {
                    e = e;
                    s0 s0Var = o1Var.w;
                    o1.m(s0Var);
                    s0Var.x.c("Error querying app. appId", s0.H(str), e);
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
        if (!cursor.moveToFirst()) {
            if (cursor != null) {
                cursor.close();
            }
            return null;
        }
        o4 o4Var = this.t;
        x0 x0Var = new x0(o4Var.C, str);
        o1 o1Var2 = x0Var.a;
        b2 e3 = o4Var.e(str);
        a2 a2Var = a2.ANALYTICS_STORAGE;
        if (e3.i(a2Var)) {
            x0Var.F(cursor.getString(0));
        }
        boolean z2 = true;
        x0Var.H(cursor.getString(1));
        if (o4Var.e(str).i(a2.AD_STORAGE)) {
            x0Var.I(cursor.getString(2));
        }
        x0Var.e(cursor.getLong(3));
        x0Var.L(cursor.getLong(4));
        x0Var.M(cursor.getLong(5));
        x0Var.O(cursor.getString(6));
        x0Var.R(cursor.getString(7));
        x0Var.S(cursor.getLong(8));
        x0Var.a(cursor.getLong(9));
        x0Var.d(cursor.isNull(10) || cursor.getInt(10) != 0);
        x0Var.i(cursor.getLong(11));
        x0Var.j(cursor.getLong(12));
        x0Var.k(cursor.getLong(13));
        x0Var.l(cursor.getLong(14));
        x0Var.f(cursor.getLong(15));
        x0Var.g(cursor.getLong(16));
        x0Var.Q(cursor.isNull(17) ? -2147483648L : cursor.getInt(17));
        x0Var.K(cursor.getString(18));
        x0Var.n(cursor.getLong(19));
        x0Var.m(cursor.getLong(20));
        x0Var.v(cursor.getString(21));
        boolean z3 = cursor.isNull(23) || cursor.getInt(23) != 0;
        m1 m1Var = o1Var2.x;
        o1.m(m1Var);
        m1Var.z();
        x0Var.Q |= x0Var.p != z3;
        x0Var.p = z3;
        x0Var.c(cursor.isNull(25) ? 0L : cursor.getLong(25));
        if (!cursor.isNull(26)) {
            x0Var.x(Arrays.asList(cursor.getString(26).split(",", -1)));
        }
        if (o4Var.e(str).i(a2Var)) {
            String string2 = cursor.getString(28);
            m1 m1Var2 = o1Var2.x;
            o1.m(m1Var2);
            m1Var2.z();
            x0Var.Q |= !Objects.equals(x0Var.t, string2);
            x0Var.t = string2;
        }
        boolean z4 = (cursor.isNull(29) || cursor.getInt(29) == 0) ? false : true;
        m1 m1Var3 = o1Var2.x;
        o1.m(m1Var3);
        m1Var3.z();
        x0Var.Q |= x0Var.u != z4;
        x0Var.u = z4;
        x0Var.r(cursor.getLong(39));
        String string3 = cursor.getString(36);
        m1 m1Var4 = o1Var2.x;
        o1.m(m1Var4);
        m1Var4.z();
        x0Var.Q |= x0Var.C != string3;
        x0Var.C = string3;
        x0Var.z(cursor.getLong(30));
        x0Var.A(cursor.getLong(31));
        m8.a();
        if (o1Var.u.J(str, c0.P0)) {
            int i = cursor.getInt(32);
            m1 m1Var5 = o1Var2.x;
            o1.m(m1Var5);
            m1Var5.z();
            x0Var.Q |= x0Var.x != i;
            x0Var.x = i;
            x0Var.B(cursor.getLong(35));
        }
        boolean z5 = (cursor.isNull(33) || cursor.getInt(33) == 0) ? false : true;
        m1 m1Var6 = o1Var2.x;
        o1.m(m1Var6);
        m1Var6.z();
        x0Var.Q |= x0Var.y != z5;
        x0Var.y = z5;
        if (cursor.isNull(34)) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(cursor.getInt(34) != 0);
        }
        m1 m1Var7 = o1Var2.x;
        o1.m(m1Var7);
        m1Var7.z();
        x0Var.Q |= !Objects.equals(x0Var.q, valueOf);
        x0Var.q = valueOf;
        x0Var.p(cursor.getInt(37));
        x0Var.q(cursor.getInt(38));
        if (cursor.isNull(40)) {
            string = "";
        } else {
            string = cursor.getString(40);
            c21.u.g(string);
        }
        m1 m1Var8 = o1Var2.x;
        o1.m(m1Var8);
        m1Var8.z();
        x0Var.Q |= x0Var.G != string;
        x0Var.G = string;
        if (!cursor.isNull(41)) {
            Long valueOf2 = Long.valueOf(cursor.getLong(41));
            m1 m1Var9 = o1Var2.x;
            o1.m(m1Var9);
            m1Var9.z();
            x0Var.Q |= !Objects.equals(x0Var.z, valueOf2);
            x0Var.z = valueOf2;
        }
        if (!cursor.isNull(42)) {
            Long valueOf3 = Long.valueOf(cursor.getLong(42));
            m1 m1Var10 = o1Var2.x;
            o1.m(m1Var10);
            m1Var10.z();
            x0Var.Q |= !Objects.equals(x0Var.A, valueOf3);
            x0Var.A = valueOf3;
        }
        byte[] blob = cursor.getBlob(43);
        m1 m1Var11 = o1Var2.x;
        o1.m(m1Var11);
        m1Var11.z();
        x0Var.Q |= x0Var.H != blob;
        x0Var.H = blob;
        if (!cursor.isNull(44)) {
            int i2 = cursor.getInt(44);
            m1 m1Var12 = o1Var2.x;
            o1.m(m1Var12);
            m1Var12.z();
            boolean z6 = x0Var.Q;
            if (x0Var.I == i2) {
                z2 = false;
            }
            x0Var.Q = z2 | z6;
            x0Var.I = i2;
        }
        m1 m1Var13 = o1Var2.x;
        o1.m(m1Var13);
        m1Var13.z();
        x0Var.Q = false;
        if (cursor.moveToNext()) {
            s0 s0Var2 = o1Var.w;
            o1.m(s0Var2);
            s0Var2.x.b(s0.H(str), "Got multiple records for app, expected one. appId");
        }
        cursor.close();
        return x0Var;
    }

    @Override // com.google.android.gms.measurement.internal.i4
    public final void C() {
    }

    public final void C0(x0 x0Var, boolean z2) {
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        o1 o1Var2 = x0Var.a;
        z();
        A();
        String D2 = x0Var.D();
        c21.u.g(D2);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", D2);
        a2 a2Var = a2.ANALYTICS_STORAGE;
        o4 o4Var = this.t;
        if (z2) {
            contentValues.put("app_instance_id", (String) null);
        } else if (o4Var.e(D2).i(a2Var)) {
            contentValues.put("app_instance_id", x0Var.E());
        }
        contentValues.put("gmp_app_id", x0Var.G());
        if (o4Var.e(D2).i(a2.AD_STORAGE)) {
            m1 m1Var = o1Var2.x;
            o1.m(m1Var);
            m1Var.z();
            contentValues.put("resettable_device_id_hash", x0Var.e);
        }
        m1 m1Var2 = o1Var2.x;
        o1.m(m1Var2);
        m1Var2.z();
        contentValues.put("last_bundle_index", Long.valueOf(x0Var.g));
        m1 m1Var3 = o1Var2.x;
        o1.m(m1Var3);
        m1Var3.z();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(x0Var.h));
        m1 m1Var4 = o1Var2.x;
        o1.m(m1Var4);
        m1Var4.z();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(x0Var.i));
        contentValues.put("app_version", x0Var.N());
        m1 m1Var5 = o1Var2.x;
        o1.m(m1Var5);
        m1Var5.z();
        contentValues.put("app_store", x0Var.l);
        m1 m1Var6 = o1Var2.x;
        o1.m(m1Var6);
        m1Var6.z();
        contentValues.put("gmp_version", Long.valueOf(x0Var.m));
        m1 m1Var7 = o1Var2.x;
        o1.m(m1Var7);
        m1Var7.z();
        contentValues.put("dev_cert_hash", Long.valueOf(x0Var.n));
        m1 m1Var8 = o1Var2.x;
        o1.m(m1Var8);
        m1Var8.z();
        contentValues.put("measurement_enabled", Boolean.valueOf(x0Var.o));
        m1 m1Var9 = o1Var2.x;
        m1 m1Var10 = o1Var2.x;
        o1.m(m1Var9);
        m1Var9.z();
        contentValues.put("day", Long.valueOf(x0Var.J));
        o1.m(m1Var10);
        m1Var10.z();
        contentValues.put("daily_public_events_count", Long.valueOf(x0Var.K));
        o1.m(m1Var10);
        m1Var10.z();
        contentValues.put("daily_events_count", Long.valueOf(x0Var.L));
        o1.m(m1Var10);
        m1Var10.z();
        contentValues.put("daily_conversions_count", Long.valueOf(x0Var.M));
        m1 m1Var11 = o1Var2.x;
        o1.m(m1Var11);
        m1Var11.z();
        contentValues.put("config_fetched_time", Long.valueOf(x0Var.R));
        m1 m1Var12 = o1Var2.x;
        o1.m(m1Var12);
        m1Var12.z();
        contentValues.put("failed_config_fetch_time", Long.valueOf(x0Var.S));
        contentValues.put("app_version_int", Long.valueOf(x0Var.P()));
        contentValues.put("firebase_instance_id", x0Var.J());
        o1.m(m1Var10);
        m1Var10.z();
        contentValues.put("daily_error_events_count", Long.valueOf(x0Var.N));
        o1.m(m1Var10);
        m1Var10.z();
        contentValues.put("daily_realtime_events_count", Long.valueOf(x0Var.O));
        o1.m(m1Var10);
        m1Var10.z();
        contentValues.put("health_monitor_sample", x0Var.P);
        contentValues.put("android_id", (Long) 0L);
        m1 m1Var13 = o1Var2.x;
        o1.m(m1Var13);
        m1Var13.z();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(x0Var.p));
        contentValues.put("dynamite_version", Long.valueOf(x0Var.b()));
        if (o4Var.e(D2).i(a2Var)) {
            m1 m1Var14 = o1Var2.x;
            o1.m(m1Var14);
            m1Var14.z();
            contentValues.put("session_stitching_token", x0Var.t);
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(x0Var.y()));
        m1 m1Var15 = o1Var2.x;
        o1.m(m1Var15);
        m1Var15.z();
        contentValues.put("target_os_version", Long.valueOf(x0Var.v));
        m1 m1Var16 = o1Var2.x;
        o1.m(m1Var16);
        m1Var16.z();
        contentValues.put("session_stitching_token_hash", Long.valueOf(x0Var.w));
        m8.a();
        h hVar = o1Var.u;
        s0 s0Var = o1Var.w;
        if (hVar.J(D2, c0.P0)) {
            m1 m1Var17 = o1Var2.x;
            o1.m(m1Var17);
            m1Var17.z();
            contentValues.put("ad_services_version", Integer.valueOf(x0Var.x));
            m1 m1Var18 = o1Var2.x;
            o1.m(m1Var18);
            m1Var18.z();
            contentValues.put("attribution_eligibility_status", Long.valueOf(x0Var.B));
        }
        m1 m1Var19 = o1Var2.x;
        o1.m(m1Var19);
        m1Var19.z();
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(x0Var.y));
        contentValues.put("npa_metadata_value", x0Var.w());
        m1 m1Var20 = o1Var2.x;
        o1.m(m1Var20);
        m1Var20.z();
        contentValues.put("bundle_delivery_index", Long.valueOf(x0Var.F));
        contentValues.put("sgtm_preview_key", x0Var.C());
        o1.m(m1Var10);
        m1Var10.z();
        contentValues.put("dma_consent_state", Integer.valueOf(x0Var.D));
        o1.m(m1Var10);
        m1Var10.z();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(x0Var.E));
        contentValues.put("serialized_npa_metadata", x0Var.s());
        contentValues.put("client_upload_eligibility", Integer.valueOf(x0Var.t()));
        m1 m1Var21 = o1Var2.x;
        o1.m(m1Var21);
        m1Var21.z();
        ArrayList arrayList = x0Var.s;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                o1.m(s0Var);
                s0Var.A.b(D2, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        if (o1Var.u.J(null, c0.K0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        m1 m1Var22 = o1Var2.x;
        o1.m(m1Var22);
        m1Var22.z();
        contentValues.put("unmatched_pfo", x0Var.z);
        m1 m1Var23 = o1Var2.x;
        o1.m(m1Var23);
        m1Var23.z();
        contentValues.put("unmatched_uwa", x0Var.A);
        m1 m1Var24 = o1Var2.x;
        o1.m(m1Var24);
        m1Var24.z();
        contentValues.put("ad_campaign_info", x0Var.H);
        try {
            SQLiteDatabase o0 = o0();
            if (o0.update("apps", contentValues, "app_id = ?", new String[]{D2}) == 0 && o0.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                o1.m(s0Var);
                s0Var.x.b(s0.H(D2), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e) {
            o1.m(s0Var);
            s0Var.x.c("Error storing app. appId", s0.H(D2), e);
        }
    }

    public final long D(String str, com.google.android.gms.internal.measurement.h3 h3Var, String str2, Map map, a3 a3Var, Long l) {
        int delete;
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        z();
        A();
        c21.u.g(h3Var);
        c21.u.d(str);
        z();
        A();
        if (g0()) {
            o4 o4Var = this.t;
            long a = o4Var.z.x.a();
            g21.a aVar = o1Var.B;
            s0 s0Var = o1Var.w;
            aVar.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - a) > ((Long) c0.M.a(null)).longValue()) {
                o4Var.z.x.b(elapsedRealtime);
                z();
                A();
                if (g0() && (delete = o0().delete("upload_queue", b0(), new String[0])) > 0) {
                    o1.m(s0Var);
                    s0Var.F.b(Integer.valueOf(delete), "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted");
                }
                c21.u.d(str);
                z();
                A();
                try {
                    int H2 = o1Var.u.H(str, c0.A);
                    if (H2 > 0) {
                        o0().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(H2)});
                    }
                } catch (SQLiteException e) {
                    o1.m(s0Var);
                    s0Var.x.c("Error deleting over the limit queued batches. appId", s0.H(str), e);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb.append(str3);
            sb.append("=");
            sb.append(str4);
            arrayList.add(sb.toString());
        }
        byte[] a2 = h3Var.a();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", a2);
        contentValues.put("upload_uri", str2);
        contentValues.put("upload_headers", String.join("\r\n", arrayList));
        contentValues.put("upload_type", Integer.valueOf(a3Var.r));
        g21.a aVar2 = o1Var.B;
        s0 s0Var2 = o1Var.w;
        aVar2.getClass();
        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l != null) {
            contentValues.put("associated_row_id", l);
        }
        try {
            long insert = o0().insert("upload_queue", null, contentValues);
            if (insert != -1) {
                return insert;
            }
            o1.m(s0Var2);
            s0Var2.x.b(str, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId");
            return -1L;
        } catch (SQLiteException e2) {
            o1.m(s0Var2);
            s0Var2.x.c("Error storing MeasurementBatch to upload_queue. appId", str, e2);
            return -1L;
        }
    }

    public final k D0(long j, String str, boolean z2, boolean z3, boolean z4, boolean z5) {
        return E0(j, str, 1L, false, false, z2, false, z3, z4, z5);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List E(String str, g4 g4Var, int i) {
        List list;
        c21.u.d(str);
        z();
        A();
        Cursor cursor = null;
        try {
            SQLiteDatabase o0 = o0();
            String[] strArr = {"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"};
            String c0 = c0(g4Var.r);
            String b0 = b0();
            StringBuilder sb = new StringBuilder(c0.length() + 17 + b0.length());
            sb.append("app_id=?");
            sb.append(c0);
            sb.append(" AND NOT ");
            sb.append(b0);
            cursor = o0.query("upload_queue", strArr, sb.toString(), new String[]{str}, null, null, "creation_timestamp ASC", i > 0 ? String.valueOf(i) : null);
            ArrayList arrayList = new ArrayList();
            while (cursor.moveToNext()) {
                p4 a0 = a0(str, cursor.getLong(0), cursor.getBlob(2), cursor.getString(3), cursor.getString(4), cursor.getInt(5), cursor.getInt(6), cursor.getLong(7), cursor.getLong(8), cursor.getLong(9));
                if (a0 != null) {
                    arrayList.add(a0);
                }
            }
            list = arrayList;
        } catch (SQLiteException e) {
            try {
                s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).w;
                o1.m(s0Var);
                s0Var.x.c("Error to querying MeasurementBatch from upload_queue. appId", str, e);
                list = Collections.EMPTY_LIST;
            } catch (Throwable th) {
                th = th;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
            }
            throw th;
        }
        if (cursor != null) {
            cursor.close();
        }
        return list;
    }

    public final k E0(long j, String str, long j2, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        c21.u.d(str);
        z();
        A();
        String[] strArr = {str};
        k kVar = new k();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase o0 = o0();
                cursor = o0.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursor.moveToFirst()) {
                    if (cursor.getLong(0) == j) {
                        kVar.b = cursor.getLong(1);
                        kVar.a = cursor.getLong(2);
                        kVar.c = cursor.getLong(3);
                        kVar.d = cursor.getLong(4);
                        kVar.e = cursor.getLong(5);
                        kVar.f = cursor.getLong(6);
                        kVar.g = cursor.getLong(7);
                    }
                    if (z2) {
                        kVar.b += j2;
                    }
                    if (z3) {
                        kVar.a += j2;
                    }
                    if (z4) {
                        kVar.c += j2;
                    }
                    if (z5) {
                        kVar.d += j2;
                    }
                    if (z6) {
                        kVar.e += j2;
                    }
                    if (z7) {
                        kVar.f += j2;
                    }
                    if (z8) {
                        kVar.g += j2;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j));
                    contentValues.put("daily_public_events_count", Long.valueOf(kVar.a));
                    contentValues.put("daily_events_count", Long.valueOf(kVar.b));
                    contentValues.put("daily_conversions_count", Long.valueOf(kVar.c));
                    contentValues.put("daily_error_events_count", Long.valueOf(kVar.d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(kVar.e));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(kVar.f));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(kVar.g));
                    o0.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    s0 s0Var = o1Var.w;
                    o1.m(s0Var);
                    s0Var.A.b(s0.H(str), "Not updating daily counts, app is not known. appId");
                }
            } catch (SQLiteException e) {
                s0 s0Var2 = o1Var.w;
                o1.m(s0Var2);
                s0Var2.x.c("Error updating daily counts. appId", s0.H(str), e);
            }
            if (cursor != null) {
                cursor.close();
            }
            return kVar;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final boolean F(String str) {
        a3[] a3VarArr = {a3.t};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(a3VarArr[0].r));
        String c0 = c0(arrayList);
        String b0 = b0();
        return j0(x.i.k(new StringBuilder((c0.length() + 61) + b0.length()), "SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?", c0, " AND NOT ", b0), new String[]{str}) != 0;
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x006c: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:27:0x006c */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a5.s F0(String str) {
        Throwable th;
        Cursor cursor;
        Cursor cursor2;
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        c21.u.d(str);
        z();
        A();
        Cursor cursor3 = null;
        try {
            try {
                cursor = o0().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (cursor.moveToFirst()) {
                        byte[] blob = cursor.getBlob(0);
                        String string = cursor.getString(1);
                        String string2 = cursor.getString(2);
                        if (cursor.moveToNext()) {
                            s0 s0Var = o1Var.w;
                            o1.m(s0Var);
                            s0Var.x.b(s0.H(str), "Got multiple records for app config, expected one. appId");
                        }
                        if (blob != null) {
                            a5.s sVar = new a5.s(blob, string, string2, 11);
                            cursor.close();
                            return sVar;
                        }
                    }
                } catch (SQLiteException e) {
                    e = e;
                    s0 s0Var2 = o1Var.w;
                    o1.m(s0Var2);
                    s0Var2.x.c("Error querying remote config. appId", s0.H(str), e);
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    throw th;
                }
                cursor3.close();
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor3 != null) {
            }
        }
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }

    public final void G(Long l) {
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        z();
        A();
        try {
            if (o0().delete("upload_queue", "rowid=?", new String[]{l.toString()}) != 1) {
                s0 s0Var = o1Var.w;
                o1.m(s0Var);
                s0Var.A.a("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e) {
            s0 s0Var2 = o1Var.w;
            o1.m(s0Var2);
            s0Var2.x.b(e, "Failed to delete a MeasurementBatch in a upload_queue table");
            throw e;
        }
    }

    public final void G0(com.google.android.gms.internal.measurement.j3 j3Var, boolean z2) {
        z();
        A();
        c21.u.d(j3Var.p());
        if (!j3Var.b2()) {
            throw new IllegalStateException();
        }
        J();
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        g21.a aVar = o1Var.B;
        s0 s0Var = o1Var.w;
        aVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        long c2 = j3Var.c2();
        b0 b0Var = c0.R;
        if (c2 < currentTimeMillis - ((Long) b0Var.a(null)).longValue() || j3Var.c2() > ((Long) b0Var.a(null)).longValue() + currentTimeMillis) {
            o1.m(s0Var);
            s0Var.A.d("Storing bundle outside of the max uploading time span. appId, now, timestamp", s0.H(j3Var.p()), Long.valueOf(currentTimeMillis), Long.valueOf(j3Var.c2()));
        }
        byte[] a = j3Var.a();
        try {
            w0 w0Var = this.t.x;
            o4.U(w0Var);
            byte[] l0 = w0Var.l0(a);
            o1.m(s0Var);
            s0Var.F.b(Integer.valueOf(l0.length), "Saving bundle, size");
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", j3Var.p());
            contentValues.put("bundle_end_timestamp", Long.valueOf(j3Var.c2()));
            contentValues.put("data", l0);
            contentValues.put("has_realtime", Integer.valueOf(z2 ? 1 : 0));
            if (j3Var.p0()) {
                contentValues.put("retry_count", Integer.valueOf(j3Var.q0()));
            }
            try {
                if (o0().insert("queue", null, contentValues) == -1) {
                    o1.m(s0Var);
                    s0Var.x.b(s0.H(j3Var.p()), "Failed to insert bundle (got -1). appId");
                }
            } catch (SQLiteException e) {
                o1.m(s0Var);
                s0Var.x.c("Error storing bundle. appId", s0.H(j3Var.p()), e);
            }
        } catch (IOException e2) {
            o1.m(s0Var);
            s0Var.x.c("Data loss. Failed to serialize bundle. appId", s0.H(j3Var.p()), e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String H() {
        SQLiteException e;
        Cursor cursor;
        SQLiteDatabase o0 = o0();
        ?? r1 = 0;
        try {
            try {
                cursor = o0.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(0);
                        cursor.close();
                        return string;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).w;
                    o1.m(s0Var);
                    s0Var.x.b(e, "Database error getting next bundle app id");
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (Throwable th) {
                r1 = o0;
                th = th;
                if (r1 != 0) {
                    r1.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (r1 != 0) {
            }
            throw th;
        }
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }

    public final void I(long j) {
        z();
        A();
        try {
            if (o0().delete("queue", "rowid=?", new String[]{String.valueOf(j)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e) {
            s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).w;
            o1.m(s0Var);
            s0Var.x.b(e, "Failed to delete a bundle in a queue table");
            throw e;
        }
    }

    public final void J() {
        z();
        A();
        if (g0()) {
            o4 o4Var = this.t;
            long a = o4Var.z.w.a();
            o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
            o1Var.B.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - a) > ((Long) c0.M.a(null)).longValue()) {
                o4Var.z.w.b(elapsedRealtime);
                z();
                A();
                if (g0()) {
                    SQLiteDatabase o0 = o0();
                    o1Var.B.getClass();
                    int delete = o0.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) c0.R.a(null)).longValue())});
                    if (delete > 0) {
                        s0 s0Var = o1Var.w;
                        o1.m(s0Var);
                        s0Var.F.b(Integer.valueOf(delete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    public final void K(ArrayList arrayList) {
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        z();
        A();
        c21.u.g(arrayList);
        if (arrayList.size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        }
        if (g0()) {
            String join = TextUtils.join(",", arrayList);
            String q = no.a.q(new StringBuilder(String.valueOf(join).length() + 2), "(", join, ")");
            if (j0(no.a.q(new StringBuilder(q.length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", q, " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
                s0 s0Var = o1Var.w;
                o1.m(s0Var);
                s0Var.A.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase o0 = o0();
                StringBuilder sb = new StringBuilder(q.length() + 127);
                sb.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb.append(q);
                sb.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                o0.execSQL(sb.toString());
            } catch (SQLiteException e) {
                s0 s0Var2 = o1Var.w;
                o1.m(s0Var2);
                s0Var2.x.b(e, "Error incrementing retry count. error");
            }
        }
    }

    public final void L(Long l) {
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        z();
        A();
        if (g0()) {
            StringBuilder sb = new StringBuilder(l.toString().length() + 86);
            sb.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb.append(l);
            sb.append(" AND retry_count =  2147483647 LIMIT 1");
            if (j0(sb.toString(), null) > 0) {
                s0 s0Var = o1Var.w;
                o1.m(s0Var);
                s0Var.A.a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase o0 = o0();
                o1Var.B.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                StringBuilder sb2 = new StringBuilder(String.valueOf(currentTimeMillis).length() + 60);
                sb2.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb2.append(currentTimeMillis);
                String sb3 = sb2.toString();
                StringBuilder sb4 = new StringBuilder(sb3.length() + 34 + l.toString().length() + 29);
                sb4.append("UPDATE upload_queue");
                sb4.append(sb3);
                sb4.append(" WHERE rowid = ");
                sb4.append(l);
                sb4.append(" AND retry_count < 2147483647");
                o0.execSQL(sb4.toString());
            } catch (SQLiteException e) {
                s0 s0Var2 = o1Var.w;
                o1.m(s0Var2);
                s0Var2.x.b(e, "Error incrementing retry count. error");
            }
        }
    }

    public final Object M(Cursor cursor, int i) {
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        int type = cursor.getType(i);
        if (type == 0) {
            s0 s0Var = o1Var.w;
            o1.m(s0Var);
            s0Var.x.a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i));
        }
        if (type == 3) {
            return cursor.getString(i);
        }
        if (type != 4) {
            s0 s0Var2 = o1Var.w;
            o1.m(s0Var2);
            s0Var2.x.b(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
            return null;
        }
        s0 s0Var3 = o1Var.w;
        o1.m(s0Var3);
        s0Var3.x.a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:(3:2|3|4)|(2:6|(3:8|9|10)(1:13))|14|15|(1:17)(2:20|21)|18|9|10) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a4, code lost:
    
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ab, code lost:
    
        r4 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ac, code lost:
    
        r0 = r0.w;
        com.google.android.gms.measurement.internal.o1.m(r0);
        r0.x.d("Error inserting column. appId", com.google.android.gms.measurement.internal.s0.H(r14), "first_open_count", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bc, code lost:
    
        r7 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long N(String str) {
        long j;
        long k0;
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        c21.u.d(str);
        c21.u.d("first_open_count");
        z();
        A();
        SQLiteDatabase o0 = o0();
        o0.beginTransaction();
        long j2 = 0;
        try {
            try {
                StringBuilder sb = new StringBuilder(48);
                sb.append("select first_open_count from app2 where app_id=?");
                j = -1;
                k0 = k0(sb.toString(), new String[]{str}, -1L);
            } catch (SQLiteException e) {
                e = e;
            }
            if (k0 == -1) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str);
                contentValues.put("first_open_count", (Integer) 0);
                contentValues.put("previous_install_count", (Integer) 0);
                if (o0.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                    s0 s0Var = o1Var.w;
                    o1.m(s0Var);
                    s0Var.x.c("Failed to insert column (got -1). appId", s0.H(str), "first_open_count");
                    return j;
                }
                k0 = 0;
            }
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put("app_id", str);
            contentValues2.put("first_open_count", Long.valueOf(1 + k0));
            if (o0.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                s0 s0Var2 = o1Var.w;
                o1.m(s0Var2);
                s0Var2.x.c("Failed to update column (got 0). appId", s0.H(str), "first_open_count");
            } else {
                o0.setTransactionSuccessful();
                j = k0;
            }
            return j;
        } finally {
            o0.endTransaction();
        }
    }

    public final boolean O(String str, String str2) {
        return j0("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    public final long P(String str) {
        c21.u.d(str);
        return k0("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final void Q(String str, Long l, long j, com.google.android.gms.internal.measurement.b3 b3Var) {
        z();
        A();
        c21.u.g(b3Var);
        c21.u.d(str);
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        byte[] a = b3Var.a();
        s0 s0Var = o1Var.w;
        s0 s0Var2 = o1Var.w;
        o1.m(s0Var);
        s0Var.F.c("Saving complex main event, appId, data size", o1Var.A.a(str), Integer.valueOf(a.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", a);
        try {
            if (o0().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                o1.m(s0Var2);
                s0Var2.x.b(s0.H(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e) {
            o1.m(s0Var2);
            s0Var2.x.c("Error storing complex main event. appId", s0.H(str), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x029c A[Catch: SQLiteException -> 0x02b8, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x02b8, blocks: (B:78:0x0281, B:80:0x029c), top: B:77:0x0281 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R(String str, Long l, String str2, Bundle bundle) {
        String string;
        String s;
        Bundle bundle2;
        s0 s0Var;
        long update;
        com.google.android.gms.internal.measurement.j3 j3Var;
        Cursor query;
        o oVar = this;
        String str3 = str;
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) oVar).s;
        c21.u.g(bundle);
        oVar.z();
        oVar.A();
        m mVar = l != null ? new m(oVar, str3, l.longValue()) : new m(oVar, str3);
        List<l> b = mVar.b();
        while (!b.isEmpty()) {
            for (l lVar : b) {
                if (!TextUtils.isEmpty(str2)) {
                    Cursor cursor = null;
                    com.google.android.gms.internal.measurement.j3 j3Var2 = null;
                    Cursor cursor2 = null;
                    try {
                        try {
                            query = oVar.o0().query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str3, Long.toString(lVar.b)}, null, null, "rowid", "2");
                            try {
                                try {
                                } catch (SQLiteException e) {
                                    e = e;
                                    j3Var = null;
                                }
                            } catch (Throwable th) {
                                th = th;
                                cursor2 = query;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (SQLiteException e2) {
                        e = e2;
                        j3Var = null;
                    }
                    if (query.moveToFirst()) {
                        try {
                            j3Var = (com.google.android.gms.internal.measurement.j3) ((com.google.android.gms.internal.measurement.i3) w0.m0(com.google.android.gms.internal.measurement.j3.U(), query.getBlob(0))).e();
                            try {
                                if (query.moveToNext()) {
                                    s0 s0Var2 = o1Var.w;
                                    o1.m(s0Var2);
                                    s0Var2.A.b(s0.H(str3), "Get multiple raw event metadata records, expected one. appId");
                                }
                                query.close();
                                query.close();
                            } catch (SQLiteException e3) {
                                e = e3;
                                cursor = query;
                                s0 s0Var3 = o1Var.w;
                                o1.m(s0Var3);
                                s0Var3.x.c("Data loss. Error selecting raw event. appId", s0.H(str3), e);
                                if (cursor != null) {
                                    cursor.close();
                                }
                                j3Var2 = j3Var;
                                if (j3Var2 != null) {
                                }
                                o4 o4Var = oVar.t;
                                w0 w0Var = o4Var.x;
                                o4.U(w0Var);
                                com.google.android.gms.internal.measurement.b3 b3Var = lVar.d;
                                Bundle bundle3 = new Bundle();
                                while (r6.hasNext()) {
                                }
                                string = bundle3.getString("_o");
                                bundle3.remove("_o");
                                s = b3Var.s();
                                if (string == null) {
                                }
                                t4 t4Var = o1Var.z;
                                s0 s0Var4 = o1Var.w;
                                o1.k(t4Var);
                                if (s.equals("_cmp")) {
                                }
                                com.google.android.gms.internal.measurement.b3 b3Var2 = b3Var;
                                t4Var.K(bundle3, bundle2);
                                s sVar = new s((o1) ((androidx.compose.foundation.lazy.layout.s0) oVar).s, string, str3, b3Var2.s(), b3Var2.u(), b3Var2.w(), bundle3);
                                String str4 = (String) sVar.u;
                                long j = lVar.a;
                                long j2 = lVar.b;
                                boolean z2 = lVar.c;
                                oVar.z();
                                oVar.A();
                                c21.u.d(str4);
                                w0 w0Var2 = o4Var.x;
                                o4.U(w0Var2);
                                byte[] a = w0Var2.b0(sVar).a();
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("app_id", str4);
                                contentValues.put("name", (String) sVar.v);
                                contentValues.put("timestamp", Long.valueOf(sVar.s));
                                contentValues.put("metadata_fingerprint", Long.valueOf(j2));
                                contentValues.put("data", a);
                                contentValues.put("realtime", Integer.valueOf(z2 ? 1 : 0));
                                update = o0().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j)});
                                if (update != 1) {
                                }
                                oVar = this;
                                str3 = str;
                            }
                            j3Var2 = j3Var;
                        } catch (IOException e4) {
                            s0 s0Var5 = o1Var.w;
                            o1.m(s0Var5);
                            s0Var5.x.c("Data loss. Failed to merge raw event metadata. appId", s0.H(str3), e4);
                        }
                        if (j3Var2 != null) {
                            Iterator it = j3Var2.U1().iterator();
                            while (it.hasNext()) {
                                if (((com.google.android.gms.internal.measurement.s3) it.next()).r().equals(str2)) {
                                    break;
                                }
                            }
                        }
                    } else {
                        s0 s0Var6 = o1Var.w;
                        o1.m(s0Var6);
                        s0Var6.x.b(s0.H(str3), "Raw event metadata record is missing. appId");
                    }
                    query.close();
                    if (j3Var2 != null) {
                    }
                }
                o4 o4Var2 = oVar.t;
                w0 w0Var3 = o4Var2.x;
                o4.U(w0Var3);
                com.google.android.gms.internal.measurement.b3 b3Var3 = lVar.d;
                Bundle bundle32 = new Bundle();
                for (com.google.android.gms.internal.measurement.e3 e3Var : b3Var3.p()) {
                    if (e3Var.x()) {
                        bundle32.putDouble(e3Var.q(), e3Var.y());
                    } else if (e3Var.v()) {
                        bundle32.putFloat(e3Var.q(), e3Var.w());
                    } else if (e3Var.t()) {
                        bundle32.putLong(e3Var.q(), e3Var.u());
                    } else if (e3Var.r()) {
                        bundle32.putString(e3Var.q(), e3Var.s());
                    } else if (e3Var.z().isEmpty()) {
                        s0 s0Var7 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) w0Var3).s).w;
                        o1.m(s0Var7);
                        s0Var7.x.b(e3Var, "Unexpected parameter type for parameter");
                    } else {
                        bundle32.putParcelableArray(e3Var.q(), w0.o0((m5) e3Var.z()));
                    }
                }
                string = bundle32.getString("_o");
                bundle32.remove("_o");
                s = b3Var3.s();
                if (string == null) {
                    string = "";
                }
                t4 t4Var2 = o1Var.z;
                s0 s0Var42 = o1Var.w;
                o1.k(t4Var2);
                if (s.equals("_cmp")) {
                    bundle2 = bundle;
                } else {
                    bundle2 = new Bundle(bundle);
                    for (String str5 : bundle.keySet()) {
                        com.google.android.gms.internal.measurement.b3 b3Var4 = b3Var3;
                        if (str5.startsWith("gad_")) {
                            bundle2.remove(str5);
                        }
                        b3Var3 = b3Var4;
                    }
                }
                com.google.android.gms.internal.measurement.b3 b3Var22 = b3Var3;
                t4Var2.K(bundle32, bundle2);
                s sVar2 = new s((o1) ((androidx.compose.foundation.lazy.layout.s0) oVar).s, string, str3, b3Var22.s(), b3Var22.u(), b3Var22.w(), bundle32);
                String str42 = (String) sVar2.u;
                long j3 = lVar.a;
                long j22 = lVar.b;
                boolean z22 = lVar.c;
                oVar.z();
                oVar.A();
                c21.u.d(str42);
                w0 w0Var22 = o4Var2.x;
                o4.U(w0Var22);
                byte[] a2 = w0Var22.b0(sVar2).a();
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("app_id", str42);
                contentValues2.put("name", (String) sVar2.v);
                contentValues2.put("timestamp", Long.valueOf(sVar2.s));
                contentValues2.put("metadata_fingerprint", Long.valueOf(j22));
                contentValues2.put("data", a2);
                contentValues2.put("realtime", Integer.valueOf(z22 ? 1 : 0));
                try {
                    update = o0().update("raw_events", contentValues2, "rowid = ?", new String[]{String.valueOf(j3)});
                    if (update != 1) {
                        o1.m(s0Var42);
                        s0Var = s0Var42;
                        try {
                            s0Var.x.c("Failed to update raw event. appId, updatedRows", s0.H(str42), Long.valueOf(update));
                        } catch (SQLiteException e5) {
                            e = e5;
                            o1.m(s0Var);
                            s0Var.x.c("Error updating raw event. appId", s0.H(str42), e);
                            oVar = this;
                            str3 = str;
                        }
                    }
                } catch (SQLiteException e6) {
                    e = e6;
                    s0Var = s0Var42;
                }
                oVar = this;
                str3 = str;
            }
            b = mVar.b();
            oVar = this;
            str3 = str;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        if (r5 == 0) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b2 S(String str) {
        Throwable th;
        SQLiteException e;
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        c21.u.g(str);
        z();
        A();
        ?? r5 = {str};
        Cursor cursor = null;
        r2 = null;
        r2 = null;
        b2 b2Var = null;
        try {
            try {
                r5 = o0().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", r5);
                try {
                    if (r5.moveToFirst()) {
                        b2Var = b2.c(r5.getString(0), r5.getInt(1));
                    } else {
                        s0 s0Var = o1Var.w;
                        o1.m(s0Var);
                        s0Var.F.a("No data found");
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    s0 s0Var2 = o1Var.w;
                    o1.m(s0Var2);
                    s0Var2.x.b(e, "Error querying database.");
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = r5;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            r5 = 0;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
            }
            throw th;
        }
        r5.close();
        return b2Var == null ? b2.c : b2Var;
    }

    public final void T(String str, c4 c4Var) {
        z();
        A();
        c21.u.d(str);
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        g21.a aVar = o1Var.B;
        s0 s0Var = o1Var.w;
        aVar.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        b0 b0Var = c0.v0;
        long longValue = currentTimeMillis - ((Long) b0Var.a(null)).longValue();
        long j = c4Var.s;
        if (j < longValue || j > ((Long) b0Var.a(null)).longValue() + currentTimeMillis) {
            o1.m(s0Var);
            s0Var.A.d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", s0.H(str), Long.valueOf(currentTimeMillis), Long.valueOf(j));
        }
        o1.m(s0Var);
        s0Var.F.a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", c4Var.r);
        contentValues.put("source", Integer.valueOf(c4Var.t));
        contentValues.put("timestamp_millis", Long.valueOf(j));
        try {
            if (o0().insert("trigger_uris", null, contentValues) == -1) {
                o1.m(s0Var);
                s0Var.x.b(s0.H(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e) {
            o1.m(s0Var);
            s0Var.x.c("Error storing trigger URI. appId", s0.H(str), e);
        }
    }

    public final void U(String str, b2 b2Var) {
        c21.u.g(str);
        c21.u.g(b2Var);
        z();
        A();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", b2Var.g());
        contentValues.put("consent_source", Integer.valueOf(b2Var.b));
        W(contentValues);
    }

    public final String V(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                cursor = o0().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return "";
                }
                String string = cursor.getString(0);
                cursor.close();
                return string;
            } catch (SQLiteException e) {
                s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).w;
                o1.m(s0Var);
                s0Var.x.c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void W(ContentValues contentValues) {
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        try {
            SQLiteDatabase o0 = o0();
            if (contentValues.getAsString("app_id") == null) {
                s0 s0Var = o1Var.w;
                o1.m(s0Var);
                s0Var.z.b(s0.H("app_id"), "Value of the primary key is not set.");
                return;
            }
            new StringBuilder(10).append("app_id = ?");
            if (o0.update("consent_settings", contentValues, r6.toString(), new String[]{r5}) == 0 && o0.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                s0 s0Var2 = o1Var.w;
                o1.m(s0Var2);
                s0Var2.x.c("Failed to insert/update table (got -1). key", s0.H("consent_settings"), s0.H("app_id"));
            }
        } catch (SQLiteException e) {
            s0 s0Var3 = o1Var.w;
            o1.m(s0Var3);
            s0Var3.x.d("Error storing into table. key", s0.H("consent_settings"), s0.H("app_id"), e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final t X(String str, String str2, String str3) {
        Cursor cursor;
        Boolean bool;
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        c21.u.d(str2);
        c21.u.d(str3);
        z();
        A();
        Cursor cursor2 = null;
        try {
            cursor = o0().query(str, (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
            try {
                try {
                } catch (SQLiteException e) {
                    e = e;
                    s0 s0Var = o1Var.w;
                    o1.m(s0Var);
                    s0Var.x.d("Error querying events. appId", s0.H(str2), o1Var.A.a(str3), e);
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
        if (!cursor.moveToFirst()) {
            if (cursor != null) {
                cursor.close();
            }
            return null;
        }
        long j = cursor.getLong(0);
        long j2 = cursor.getLong(1);
        long j3 = cursor.getLong(2);
        long j4 = cursor.isNull(3) ? 0L : cursor.getLong(3);
        Long valueOf = cursor.isNull(4) ? null : Long.valueOf(cursor.getLong(4));
        Long valueOf2 = cursor.isNull(5) ? null : Long.valueOf(cursor.getLong(5));
        Long valueOf3 = cursor.isNull(6) ? null : Long.valueOf(cursor.getLong(6));
        if (cursor.isNull(7)) {
            bool = null;
        } else {
            bool = Boolean.valueOf(cursor.getLong(7) == 1);
        }
        t tVar = new t(str2, str3, j, j2, cursor.isNull(8) ? 0L : cursor.getLong(8), j3, j4, valueOf, valueOf2, valueOf3, bool);
        if (cursor.moveToNext()) {
            s0 s0Var2 = o1Var.w;
            o1.m(s0Var2);
            s0Var2.x.b(s0.H(str2), "Got multiple records for event aggregates, expected one. appId");
        }
        cursor.close();
        return tVar;
    }

    public final void Y(String str, t tVar) {
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        c21.u.g(tVar);
        z();
        A();
        ContentValues contentValues = new ContentValues();
        String str2 = tVar.a;
        contentValues.put("app_id", str2);
        contentValues.put("name", tVar.b);
        contentValues.put("lifetime_count", Long.valueOf(tVar.c));
        contentValues.put("current_bundle_count", Long.valueOf(tVar.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(tVar.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(tVar.g));
        contentValues.put("last_bundled_day", tVar.h);
        contentValues.put("last_sampled_complex_event_id", tVar.i);
        contentValues.put("last_sampling_rate", tVar.j);
        contentValues.put("current_session_count", Long.valueOf(tVar.e));
        Boolean bool = tVar.k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (o0().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                s0 s0Var = o1Var.w;
                o1.m(s0Var);
                s0Var.x.b(s0.H(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e) {
            s0 s0Var2 = o1Var.w;
            o1.m(s0Var2);
            s0Var2.x.c("Error storing event aggregates. appId", s0.H(str2), e);
        }
    }

    public final void Z(String str, String str2) {
        c21.u.d(str2);
        z();
        A();
        try {
            o0().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e) {
            s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).w;
            o1.m(s0Var);
            s0Var.x.c("Error deleting snapshot. appId", s0.H(str2), e);
        }
    }

    public final p4 a0(String str, long j, byte[] bArr, String str2, String str3, int i, int i2, long j2, long j3, long j4) {
        a3 a3Var;
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        if (TextUtils.isEmpty(str2)) {
            s0 s0Var = o1Var.w;
            o1.m(s0Var);
            s0Var.E.a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            com.google.android.gms.internal.measurement.g3 g3Var = (com.google.android.gms.internal.measurement.g3) w0.m0(com.google.android.gms.internal.measurement.h3.w(), bArr);
            a3[] values = a3.values();
            int length = values.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    a3Var = a3.x;
                    break;
                }
                a3Var = values[i3];
                if (a3Var.r == i) {
                    break;
                }
                i3++;
            }
            if (a3Var != a3.t && a3Var != a3.w && i2 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.h3) g3Var.s).p()).iterator();
                while (it.hasNext()) {
                    com.google.android.gms.internal.measurement.i3 i3Var = (com.google.android.gms.internal.measurement.i3) ((com.google.android.gms.internal.measurement.j3) it.next()).i();
                    i3Var.b();
                    ((com.google.android.gms.internal.measurement.j3) i3Var.s).T0(i2);
                    arrayList.add((com.google.android.gms.internal.measurement.j3) i3Var.e());
                }
                g3Var.b();
                ((com.google.android.gms.internal.measurement.h3) g3Var.s).B();
                g3Var.b();
                ((com.google.android.gms.internal.measurement.h3) g3Var.s).A(arrayList);
            }
            HashMap hashMap = new HashMap();
            if (str3 != null) {
                String[] split = str3.split("\r\n");
                int length2 = split.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length2) {
                        break;
                    }
                    String str4 = split[i4];
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] split2 = str4.split("=", 2);
                    if (split2.length != 2) {
                        s0 s0Var2 = o1Var.w;
                        o1.m(s0Var2);
                        s0Var2.x.b(str4, "Invalid upload header: ");
                        break;
                    }
                    hashMap.put(split2[0], split2[1]);
                    i4++;
                }
            }
            return new p4(j, (com.google.android.gms.internal.measurement.h3) g3Var.e(), str2, hashMap, a3Var, j2, j3, j4, i2);
        } catch (IOException e) {
            s0 s0Var3 = o1Var.w;
            o1.m(s0Var3);
            s0Var3.x.c("Failed to queued MeasurementBatch from upload_queue. appId", str, e);
            return null;
        }
    }

    public final String b0() {
        ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).B.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.US;
        Long l = (Long) c0.S.a(null);
        l.getClass();
        String str = "(upload_type = 1 AND ABS(creation_timestamp - " + currentTimeMillis + ") > " + l + ")";
        long longValue = ((Long) c0.R.a(null)).longValue();
        StringBuilder sb = new StringBuilder("(upload_type != 1 AND ABS(creation_timestamp - ");
        sb.append(currentTimeMillis);
        sb.append(") > ");
        String f = a0.s0.f(longValue, ")", sb);
        StringBuilder sb2 = new StringBuilder(str.length() + 5 + f.length() + 1);
        f1.e.x(sb2, "(", str, " OR ", f);
        sb2.append(")");
        return sb2.toString();
    }

    public final void d0(String str, b2 b2Var) {
        c21.u.g(str);
        z();
        A();
        U(str, S(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", b2Var.g());
        W(contentValues);
    }

    public final b2 e0(String str) {
        c21.u.g(str);
        z();
        A();
        return b2.c(V("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}), 100);
    }

    public final t f0(String str, com.google.android.gms.internal.measurement.b3 b3Var, String str2) {
        t X = X("events", str, b3Var.s());
        if (X != null) {
            long j = X.e + 1;
            long j2 = X.d + 1;
            return new t(X.a, X.b, X.c + 1, j2, j, X.f, X.g, X.h, X.i, X.j, X.k);
        }
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        s0 s0Var = o1Var.w;
        o1.m(s0Var);
        s0Var.A.c("Event aggregate wasn't created during raw event logging. appId, event", s0.H(str), o1Var.A.a(str2));
        return new t(str, b3Var.s(), 1L, 1L, 1L, b3Var.u(), 0L, null, null, null, null);
    }

    public final boolean g0() {
        return ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).r.getDatabasePath("google_app_measurement.db").exists();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h0(String str, long j, long j2, b1 b1Var) {
        String str2;
        String str3;
        Cursor cursor;
        SQLiteDatabase o0;
        ?? isEmpty;
        String[] strArr;
        String str4;
        String string;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String str5;
        long j3;
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        z();
        A();
        Cursor cursor2 = null;
        cursor2 = null;
        SQLiteCursor sQLiteCursor = 0;
        try {
            try {
                o0 = o0();
                isEmpty = TextUtils.isEmpty(str);
            } catch (Throwable th) {
                th = th;
            }
        } catch (SQLiteException e) {
            e = e;
            str2 = str;
        }
        try {
            if (isEmpty != 0) {
                String[] strArr5 = j2 != -1 ? new String[]{String.valueOf(j2), String.valueOf(j)} : new String[]{String.valueOf(j)};
                str4 = j2 != -1 ? "rowid <= ? and " : "";
                StringBuilder sb = new StringBuilder(str4.length() + 148);
                sb.append("select app_id, metadata_fingerprint from raw_events where ");
                sb.append(str4);
                sb.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                cursor = o0.rawQuery(sb.toString(), strArr5);
                try {
                } catch (SQLiteException e2) {
                    e = e2;
                    str3 = str;
                }
                if (!cursor.moveToFirst()) {
                    if (cursor == null) {
                        cursor.close();
                        return;
                    }
                    return;
                }
                str3 = cursor.getString(0);
                try {
                    string = cursor.getString(1);
                    cursor.close();
                } catch (SQLiteException e3) {
                    e = e3;
                    cursor2 = cursor;
                    s0 s0Var = o1Var.w;
                    o1.m(s0Var);
                    s0Var.x.c("Data loss. Error selecting raw event. appId", s0.H(str3), e);
                    cursor = cursor2;
                    if (cursor == null) {
                    }
                }
            } else {
                try {
                    if (j2 != -1) {
                        String str6 = str;
                        strArr = new String[]{str6, String.valueOf(j2)};
                        isEmpty = str6;
                    } else {
                        String str7 = str;
                        strArr = new String[]{str7};
                        isEmpty = str7;
                    }
                    str4 = j2 != -1 ? " and rowid <= ?" : "";
                    StringBuilder sb2 = new StringBuilder(str4.length() + 84);
                    sb2.append("select metadata_fingerprint from raw_events where app_id = ?");
                    sb2.append(str4);
                    sb2.append(" order by rowid limit 1;");
                    cursor = o0.rawQuery(sb2.toString(), strArr);
                } catch (SQLiteException e4) {
                    e = e4;
                    str2 = isEmpty;
                }
                try {
                } catch (SQLiteException e5) {
                    e = e5;
                    cursor2 = cursor;
                    str2 = isEmpty;
                    str3 = str2;
                    s0 s0Var2 = o1Var.w;
                    o1.m(s0Var2);
                    s0Var2.x.c("Data loss. Error selecting raw event. appId", s0.H(str3), e);
                    cursor = cursor2;
                    if (cursor == null) {
                    }
                }
                if (cursor.moveToFirst()) {
                    string = cursor.getString(0);
                    cursor.close();
                    str3 = isEmpty;
                } else if (cursor == null) {
                }
            }
            cursor = o0.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str3, string}, null, null, "rowid", "2");
            if (cursor.moveToFirst()) {
                try {
                    com.google.android.gms.internal.measurement.j3 j3Var = (com.google.android.gms.internal.measurement.j3) ((com.google.android.gms.internal.measurement.i3) w0.m0(com.google.android.gms.internal.measurement.j3.U(), cursor.getBlob(0))).e();
                    if (cursor.moveToNext()) {
                        s0 s0Var3 = o1Var.w;
                        o1.m(s0Var3);
                        s0Var3.A.b(s0.H(str3), "Get multiple raw event metadata records, expected one. appId");
                    }
                    cursor.close();
                    b1Var.b = j3Var;
                    if (o1Var.u.J(null, c0.k1)) {
                        long k0 = k0("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{str3, string}, -1L);
                        if (j2 != -1) {
                            j3 = j2;
                        } else if (k0 != -1) {
                            j3 = -1;
                        } else {
                            strArr2 = new String[]{str3, string};
                            strArr4 = strArr2;
                            str5 = "app_id = ? and metadata_fingerprint = ?";
                        }
                        if (j3 != -1 && k0 != -1) {
                            k0 = Math.min(j3, k0);
                        } else if (j3 != -1) {
                            k0 = j3;
                        }
                        strArr3 = new String[]{str3, string, String.valueOf(k0)};
                        strArr4 = strArr3;
                        str5 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                    } else if (j2 != -1) {
                        strArr3 = new String[]{str3, string, String.valueOf(j2)};
                        strArr4 = strArr3;
                        str5 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                    } else {
                        strArr2 = new String[]{str3, string};
                        strArr4 = strArr2;
                        str5 = "app_id = ? and metadata_fingerprint = ?";
                    }
                    cursor2 = o0.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str5, strArr4, null, null, "rowid", null);
                    try {
                        if (cursor2.moveToFirst()) {
                            do {
                                long j4 = cursor2.getLong(0);
                                try {
                                    com.google.android.gms.internal.measurement.a3 a3Var = (com.google.android.gms.internal.measurement.a3) w0.m0(com.google.android.gms.internal.measurement.b3.z(), cursor2.getBlob(3));
                                    String string2 = cursor2.getString(1);
                                    a3Var.b();
                                    ((com.google.android.gms.internal.measurement.b3) a3Var.s).F(string2);
                                    long j5 = cursor2.getLong(2);
                                    a3Var.b();
                                    ((com.google.android.gms.internal.measurement.b3) a3Var.s).G(j5);
                                    if (!b1Var.c(j4, (com.google.android.gms.internal.measurement.b3) a3Var.e())) {
                                        break;
                                    }
                                } catch (IOException e6) {
                                    s0 s0Var4 = o1Var.w;
                                    o1.m(s0Var4);
                                    s0Var4.x.c("Data loss. Failed to merge raw event. appId", s0.H(str3), e6);
                                }
                            } while (cursor2.moveToNext());
                        } else {
                            s0 s0Var5 = o1Var.w;
                            o1.m(s0Var5);
                            s0Var5.A.b(s0.H(str3), "Raw event data disappeared while in transaction. appId");
                        }
                    } catch (SQLiteException e7) {
                        e = e7;
                        s0 s0Var22 = o1Var.w;
                        o1.m(s0Var22);
                        s0Var22.x.c("Data loss. Error selecting raw event. appId", s0.H(str3), e);
                        cursor = cursor2;
                        if (cursor == null) {
                        }
                    }
                    cursor = cursor2;
                } catch (IOException e8) {
                    s0 s0Var6 = o1Var.w;
                    o1.m(s0Var6);
                    s0Var6.x.c("Data loss. Failed to merge raw event metadata. appId", s0.H(str3), e8);
                }
            } else {
                s0 s0Var7 = o1Var.w;
                o1.m(s0Var7);
                s0Var7.x.b(s0.H(str3), "Raw event metadata record is missing. appId");
            }
            if (cursor == null) {
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteCursor = "select metadata_fingerprint from raw_events where app_id = ?";
            if (sQLiteCursor != 0) {
                sQLiteCursor.close();
            }
            throw th;
        }
    }

    public final long j0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = o0().rawQuery(str, strArr);
                if (!rawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j = rawQuery.getLong(0);
                rawQuery.close();
                return j;
            } catch (SQLiteException e) {
                s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).w;
                o1.m(s0Var);
                s0Var.x.c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long k0(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            try {
                cursor = o0().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    j = cursor.getLong(0);
                }
                cursor.close();
                return j;
            } catch (SQLiteException e) {
                s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).w;
                o1.m(s0Var);
                s0Var.x.c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void l0() {
        A();
        o0().beginTransaction();
    }

    public final void m0() {
        A();
        o0().setTransactionSuccessful();
    }

    public final void n0() {
        A();
        o0().endTransaction();
    }

    public final SQLiteDatabase o0() {
        z();
        try {
            return this.v.getWritableDatabase();
        } catch (SQLiteException e) {
            s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).w;
            o1.m(s0Var);
            s0Var.A.b(e, "Error opening database");
            throw e;
        }
    }

    public final void p0(String str) {
        t X;
        Z("events_snapshot", str);
        Cursor cursor = null;
        try {
            try {
                cursor = o0().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString(0);
                        if (string != null && (X = X("events", str, string)) != null) {
                            Y("events_snapshot", X);
                        }
                    } while (cursor.moveToNext());
                }
            } catch (SQLiteException e) {
                s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).w;
                o1.m(s0Var);
                s0Var.x.c("Error creating snapshot. appId", s0.H(str), e);
            }
            if (cursor != null) {
                cursor.close();
            }
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0059, code lost:
    
        if (r8 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        Y("events", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c1, code lost:
    
        if (r8 != null) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q0(String str) {
        boolean z2;
        t X;
        ArrayList arrayList = new ArrayList(Arrays.asList("name", "lifetime_count"));
        t X2 = X("events", str, "_f");
        t X3 = X("events", str, "_v");
        Z("events", str);
        Cursor cursor = null;
        boolean z3 = false;
        try {
            cursor = o0().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
        } catch (SQLiteException e) {
            e = e;
            z2 = false;
        } catch (Throwable th) {
            th = th;
            z2 = false;
        }
        if (!cursor.moveToFirst()) {
            cursor.close();
            if (X2 == null) {
            }
            Y("events", X2);
            Z("events_snapshot", str);
        }
        boolean z4 = false;
        z2 = false;
        do {
            try {
                String string = cursor.getString(0);
                if (cursor.getLong(1) >= 1) {
                    if ("_f".equals(string)) {
                        z4 = true;
                    } else if ("_v".equals(string)) {
                        z2 = true;
                    }
                }
                if (string != null && (X = X("events_snapshot", str, string)) != null) {
                    Y("events", X);
                }
            } catch (SQLiteException e2) {
                e = e2;
                z3 = z4;
                try {
                    s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).w;
                    o1.m(s0Var);
                    s0Var.x.c("Error querying snapshot. appId", s0.H(str), e);
                    z4 = z3;
                    if (cursor != null) {
                    }
                    if (!z4) {
                    }
                    if (!z2) {
                    }
                    Z("events_snapshot", str);
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (z3 && X2 != null) {
                        Y("events", X2);
                    } else if (!z2 && X3 != null) {
                        Y("events", X3);
                    }
                    Z("events_snapshot", str);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                z3 = z4;
                if (cursor != null) {
                }
                if (z3) {
                }
                if (!z2) {
                    Y("events", X3);
                }
                Z("events_snapshot", str);
                throw th;
            }
        } while (cursor.moveToNext());
        if (cursor != null) {
            cursor.close();
        }
        if (!z4 || X2 == null) {
            if (!z2) {
            }
            Z("events_snapshot", str);
        }
        Y("events", X2);
        Z("events_snapshot", str);
    }

    public final void r0(String str, String str2) {
        c21.u.d(str);
        c21.u.d(str2);
        z();
        A();
        try {
            o0().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
            s0 s0Var = o1Var.w;
            o1.m(s0Var);
            s0Var.x.d("Error deleting user property. appId", s0.H(str), o1Var.A.c(str2), e);
        }
    }

    public final boolean s0(r4 r4Var) {
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        String str = r4Var.b;
        z();
        A();
        String str2 = r4Var.a;
        String str3 = r4Var.c;
        if (t0(str2, str3) == null) {
            if (t4.y0(str3)) {
                if (j0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str2}) >= Math.max(Math.min(o1Var.u.H(str2, c0.V), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str3)) {
                long j0 = j0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str2, str});
                o1Var.getClass();
                if (j0 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str2);
        contentValues.put("origin", str);
        contentValues.put("name", str3);
        contentValues.put("set_timestamp", Long.valueOf(r4Var.d));
        i0(contentValues, r4Var.e);
        try {
            if (o0().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            s0 s0Var = o1Var.w;
            o1.m(s0Var);
            s0Var.x.b(s0.H(str2), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e) {
            s0 s0Var2 = o1Var.w;
            o1.m(s0Var2);
            s0Var2.x.c("Error storing user property. appId", s0.H(str2), e);
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r4 t0(String str, String str2) {
        Throwable th;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursor;
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        c21.u.d(str);
        c21.u.d(str2);
        z();
        A();
        Cursor cursor2 = null;
        try {
            cursor = o0().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (cursor.moveToFirst()) {
                        long j = cursor.getLong(0);
                        Object M = M(cursor, 1);
                        if (M != null) {
                            str3 = str;
                            str4 = str2;
                            try {
                                r4 r4Var = new r4(str3, cursor.getString(2), str4, j, M);
                                if (cursor.moveToNext()) {
                                    s0 s0Var = o1Var.w;
                                    o1.m(s0Var);
                                    s0Var.x.b(s0.H(str3), "Got multiple records for user property, expected one. appId");
                                }
                                cursor.close();
                                return r4Var;
                            } catch (SQLiteException e) {
                                e = e;
                                sQLiteException = e;
                                s0 s0Var2 = o1Var.w;
                                o1.m(s0Var2);
                                s0Var2.x.d("Error querying user property. appId", s0.H(str3), o1Var.A.c(str4), sQLiteException);
                                if (cursor != null) {
                                }
                                return null;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                        throw th;
                    }
                    cursor2.close();
                    throw th;
                }
            } catch (SQLiteException e2) {
                e = e2;
                str3 = str;
                str4 = str2;
            }
        } catch (SQLiteException e3) {
            str3 = str;
            str4 = str2;
            sQLiteException = e3;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
            }
        }
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List u0(String str) {
        String str2;
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        c21.u.d(str);
        z();
        A();
        ?? arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                o1Var.getClass();
                cursor = o0().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                try {
                    if (cursor.moveToFirst()) {
                        while (true) {
                            String string = cursor.getString(0);
                            String string2 = cursor.getString(1);
                            if (string2 == null) {
                                string2 = "";
                            }
                            String str3 = string2;
                            long j = cursor.getLong(2);
                            Object M = M(cursor, 3);
                            if (M == null) {
                                s0 s0Var = o1Var.w;
                                o1.m(s0Var);
                                s0Var.x.b(s0.H(str), "Read invalid user property value, ignoring it. appId");
                                str2 = str;
                            } else {
                                str2 = str;
                                try {
                                    arrayList.add(new r4(str2, str3, string, j, M));
                                } catch (SQLiteException e) {
                                    e = e;
                                    s0 s0Var2 = o1Var.w;
                                    o1.m(s0Var2);
                                    s0Var2.x.c("Error querying user properties. appId", s0.H(str2), e);
                                    arrayList = Collections.EMPTY_LIST;
                                    if (cursor != null) {
                                    }
                                    return arrayList;
                                }
                            }
                            if (!cursor.moveToNext()) {
                                break;
                            }
                            str = str2;
                        }
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    str2 = str;
                }
            } finally {
            }
        } catch (SQLiteException e3) {
            e = e3;
            str2 = str;
        }
        if (cursor != null) {
            cursor.close();
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b1, code lost:
    
        com.google.android.gms.measurement.internal.o1.m(r13);
        r13.x.b(1000, "Read more than the max allowed user properties, ignoring excess");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012e  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List v0(String str, String str2, String str3) {
        Cursor cursor;
        String str4;
        Cursor cursor2;
        String str5;
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        c21.u.d(str);
        z();
        A();
        ?? arrayList = new ArrayList();
        try {
            ArrayList arrayList2 = new ArrayList(3);
            String str6 = str;
            arrayList2.add(str6);
            StringBuilder sb = new StringBuilder("app_id=?");
            if (!TextUtils.isEmpty(str2)) {
                arrayList2.add(str2);
                sb.append(" and origin=?");
            }
            if (!TextUtils.isEmpty(str3)) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1);
                sb2.append(str3);
                sb2.append("*");
                arrayList2.add(sb2.toString());
                sb.append(" and name glob ?");
            }
            String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            String sb3 = sb.toString();
            o1Var.getClass();
            s0 s0Var = o1Var.w;
            cursor2 = o0().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, sb3, strArr, null, null, "rowid", "1001");
            try {
                try {
                    if (cursor2.moveToFirst()) {
                        str4 = str2;
                        while (true) {
                            try {
                                if (arrayList.size() >= 1000) {
                                    break;
                                }
                                String string = cursor2.getString(0);
                                long j = cursor2.getLong(1);
                                Object M = M(cursor2, 2);
                                String string2 = cursor2.getString(3);
                                if (M == null) {
                                    try {
                                        o1.m(s0Var);
                                        s0Var.x.d("(2)Read invalid user property value, ignoring it", s0.H(str6), string2, str3);
                                        str5 = string2;
                                    } catch (SQLiteException e) {
                                        e = e;
                                        str5 = string2;
                                        cursor = cursor2;
                                        str4 = str5;
                                        try {
                                            s0 s0Var2 = o1Var.w;
                                            o1.m(s0Var2);
                                            s0Var2.x.d("(2)Error querying user properties", s0.H(str), str4, e);
                                            arrayList = Collections.EMPTY_LIST;
                                            cursor2 = cursor;
                                            if (cursor2 != null) {
                                            }
                                            return arrayList;
                                        } catch (Throwable th) {
                                            th = th;
                                            if (cursor != null) {
                                            }
                                            throw th;
                                        }
                                    }
                                } else {
                                    str5 = string2;
                                    try {
                                        arrayList.add(new r4(str, str5, string, j, M));
                                    } catch (SQLiteException e2) {
                                        e = e2;
                                        cursor = cursor2;
                                        str4 = str5;
                                        s0 s0Var22 = o1Var.w;
                                        o1.m(s0Var22);
                                        s0Var22.x.d("(2)Error querying user properties", s0.H(str), str4, e);
                                        arrayList = Collections.EMPTY_LIST;
                                        cursor2 = cursor;
                                        if (cursor2 != null) {
                                        }
                                        return arrayList;
                                    }
                                }
                                if (!cursor2.moveToNext()) {
                                    break;
                                }
                                str6 = str;
                                str4 = str5;
                            } catch (SQLiteException e3) {
                                e = e3;
                                cursor = cursor2;
                                s0 s0Var222 = o1Var.w;
                                o1.m(s0Var222);
                                s0Var222.x.d("(2)Error querying user properties", s0.H(str), str4, e);
                                arrayList = Collections.EMPTY_LIST;
                                cursor2 = cursor;
                                if (cursor2 != null) {
                                }
                                return arrayList;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursor2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e4) {
                e = e4;
                str4 = str2;
            }
        } catch (SQLiteException e5) {
            e = e5;
            str4 = str2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
        if (cursor2 != null) {
            cursor2.close();
        }
        return arrayList;
    }

    public final boolean w0(f fVar) {
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        z();
        A();
        String str = fVar.r;
        c21.u.g(str);
        if (t0(str, fVar.t.s) == null) {
            long j0 = j0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            o1Var.getClass();
            if (j0 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", fVar.s);
        contentValues.put("name", fVar.t.s);
        Object j = fVar.t.j();
        c21.u.g(j);
        i0(contentValues, j);
        contentValues.put("active", Boolean.valueOf(fVar.v));
        contentValues.put("trigger_event_name", fVar.w);
        contentValues.put("trigger_timeout", Long.valueOf(fVar.y));
        w wVar = fVar.x;
        t4 t4Var = o1Var.z;
        s0 s0Var = o1Var.w;
        o1.k(t4Var);
        contentValues.put("timed_out_event", t4.e0(wVar));
        contentValues.put("creation_timestamp", Long.valueOf(fVar.u));
        o1.k(t4Var);
        contentValues.put("triggered_event", t4.e0(fVar.z));
        contentValues.put("triggered_timestamp", Long.valueOf(fVar.t.t));
        contentValues.put("time_to_live", Long.valueOf(fVar.A));
        contentValues.put("expired_event", t4.e0(fVar.B));
        try {
            if (o0().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            o1.m(s0Var);
            s0Var.x.b(s0.H(str), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e) {
            o1.m(s0Var);
            s0Var.x.c("Error storing conditional user property", s0.H(str), e);
            return true;
        }
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x00f6: MOVE (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:37:0x00f6 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f x0(String str, String str2) {
        String str3;
        Cursor cursor;
        Cursor cursor2;
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        c21.u.d(str);
        c21.u.d(str2);
        z();
        A();
        Cursor cursor3 = null;
        try {
            try {
                cursor = o0().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                } catch (SQLiteException e) {
                    e = e;
                    str3 = str2;
                }
            } catch (Throwable th) {
                th = th;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    cursor3.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            str3 = str2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor3 != null) {
            }
            throw th;
        }
        if (!cursor.moveToFirst()) {
            if (cursor != null) {
                cursor.close();
            }
            return null;
        }
        String string = cursor.getString(0);
        if (string == null) {
            string = "";
        }
        String str4 = string;
        Object M = M(cursor, 1);
        boolean z2 = cursor.getInt(2) != 0;
        String string2 = cursor.getString(3);
        long j = cursor.getLong(4);
        w0 w0Var = this.t.x;
        o4.U(w0Var);
        byte[] blob = cursor.getBlob(5);
        Parcelable.Creator<w> creator = w.CREATOR;
        w wVar = (w) w0Var.e0(blob, creator);
        long j2 = cursor.getLong(6);
        o4.U(w0Var);
        w wVar2 = (w) w0Var.e0(cursor.getBlob(7), creator);
        long j3 = cursor.getLong(8);
        long j4 = cursor.getLong(9);
        o4.U(w0Var);
        str3 = str2;
        try {
            f fVar = new f(str, str4, new q4(j3, M, str3, str4), j2, z2, string2, wVar, j, wVar2, j4, (w) w0Var.e0(cursor.getBlob(10), creator));
            if (cursor.moveToNext()) {
                s0 s0Var = o1Var.w;
                o1.m(s0Var);
                s0Var.x.c("Got multiple records for conditional property, expected one", s0.H(str), o1Var.A.c(str3));
            }
            cursor.close();
            return fVar;
        } catch (SQLiteException e3) {
            e = e3;
            s0 s0Var2 = o1Var.w;
            o1.m(s0Var2);
            s0Var2.x.d("Error querying conditional property", s0.H(str), o1Var.A.c(str3), e);
            if (cursor != null) {
            }
            return null;
        }
    }

    public final void y0(String str, String str2) {
        c21.u.d(str);
        c21.u.d(str2);
        z();
        A();
        try {
            o0().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
            s0 s0Var = o1Var.w;
            o1.m(s0Var);
            s0Var.x.d("Error deleting conditional property", s0.H(str), o1Var.A.c(str2), e);
        }
    }

    public final List z0(String str, String str2, String str3) {
        c21.u.d(str);
        z();
        A();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return A0(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }
}
