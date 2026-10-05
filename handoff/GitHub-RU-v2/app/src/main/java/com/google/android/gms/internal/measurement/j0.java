package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j0 extends x implements l0 {
    @Override // com.google.android.gms.internal.measurement.l0
    public final void beginAdUnitExposure(String str, long j) {
        Parcel g = g();
        g.writeString(str);
        g.writeLong(j);
        L(g, 23);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel g = g();
        g.writeString(str);
        g.writeString(str2);
        z.b(g, bundle);
        L(g, 9);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void endAdUnitExposure(String str, long j) {
        Parcel g = g();
        g.writeString(str);
        g.writeLong(j);
        L(g, 24);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void generateEventId(n0 n0Var) {
        Parcel g = g();
        z.c(g, n0Var);
        L(g, 22);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void getCachedAppInstanceId(n0 n0Var) {
        Parcel g = g();
        z.c(g, n0Var);
        L(g, 19);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void getConditionalUserProperties(String str, String str2, n0 n0Var) {
        Parcel g = g();
        g.writeString(str);
        g.writeString(str2);
        z.c(g, n0Var);
        L(g, 10);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void getCurrentScreenClass(n0 n0Var) {
        Parcel g = g();
        z.c(g, n0Var);
        L(g, 17);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void getCurrentScreenName(n0 n0Var) {
        Parcel g = g();
        z.c(g, n0Var);
        L(g, 16);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void getGmpAppId(n0 n0Var) {
        Parcel g = g();
        z.c(g, n0Var);
        L(g, 21);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void getMaxUserProperties(String str, n0 n0Var) {
        Parcel g = g();
        g.writeString(str);
        z.c(g, n0Var);
        L(g, 6);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void getUserProperties(String str, String str2, boolean z, n0 n0Var) {
        Parcel g = g();
        g.writeString(str);
        g.writeString(str2);
        ClassLoader classLoader = z.a;
        g.writeInt(z ? 1 : 0);
        z.c(g, n0Var);
        L(g, 5);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void initialize(j21.a aVar, u0 u0Var, long j) {
        Parcel g = g();
        z.c(g, aVar);
        z.b(g, u0Var);
        g.writeLong(j);
        L(g, 1);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) {
        Parcel g = g();
        g.writeString(str);
        g.writeString(str2);
        z.b(g, bundle);
        g.writeInt(z ? 1 : 0);
        g.writeInt(1);
        g.writeLong(j);
        L(g, 2);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void logHealthData(int i, String str, j21.a aVar, j21.a aVar2, j21.a aVar3) {
        Parcel g = g();
        g.writeInt(5);
        g.writeString("Error with data collection. Data lost.");
        z.c(g, aVar);
        z.c(g, aVar2);
        z.c(g, aVar3);
        L(g, 33);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void onActivityCreatedByScionActivityInfo(w0 w0Var, Bundle bundle, long j) {
        Parcel g = g();
        z.b(g, w0Var);
        z.b(g, bundle);
        g.writeLong(j);
        L(g, 53);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void onActivityDestroyedByScionActivityInfo(w0 w0Var, long j) {
        Parcel g = g();
        z.b(g, w0Var);
        g.writeLong(j);
        L(g, 54);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void onActivityPausedByScionActivityInfo(w0 w0Var, long j) {
        Parcel g = g();
        z.b(g, w0Var);
        g.writeLong(j);
        L(g, 55);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void onActivityResumedByScionActivityInfo(w0 w0Var, long j) {
        Parcel g = g();
        z.b(g, w0Var);
        g.writeLong(j);
        L(g, 56);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void onActivitySaveInstanceStateByScionActivityInfo(w0 w0Var, n0 n0Var, long j) {
        Parcel g = g();
        z.b(g, w0Var);
        z.c(g, n0Var);
        g.writeLong(j);
        L(g, 57);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void onActivityStartedByScionActivityInfo(w0 w0Var, long j) {
        Parcel g = g();
        z.b(g, w0Var);
        g.writeLong(j);
        L(g, 51);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void onActivityStoppedByScionActivityInfo(w0 w0Var, long j) {
        Parcel g = g();
        z.b(g, w0Var);
        g.writeLong(j);
        L(g, 52);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void registerOnMeasurementEventListener(r0 r0Var) {
        Parcel g = g();
        z.c(g, r0Var);
        L(g, 35);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void retrieveAndUploadBatches(p0 p0Var) {
        Parcel g = g();
        z.c(g, p0Var);
        L(g, 58);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel g = g();
        z.b(g, bundle);
        g.writeLong(j);
        L(g, 8);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void setCurrentScreenByScionActivityInfo(w0 w0Var, String str, String str2, long j) {
        Parcel g = g();
        z.b(g, w0Var);
        g.writeString(str);
        g.writeString(str2);
        g.writeLong(j);
        L(g, 50);
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void setDataCollectionEnabled(boolean z) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.l0
    public final void setUserProperty(String str, String str2, j21.a aVar, boolean z, long j) {
        Parcel g = g();
        g.writeString("fcm");
        g.writeString("_ln");
        z.c(g, aVar);
        g.writeInt(1);
        g.writeLong(j);
        L(g, 4);
    }
}
