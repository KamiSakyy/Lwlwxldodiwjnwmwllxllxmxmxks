package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class k0 extends y implements l0 {
    public static l0 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return queryLocalInterface instanceof l0 ? (l0) queryLocalInterface : new j0(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService", 0);
    }

    @Override // com.google.android.gms.internal.measurement.y
    public final boolean e(int i, Parcel parcel, Parcel parcel2) {
        boolean z;
        n0 n0Var = null;
        p0 p0Var = null;
        n0 n0Var2 = null;
        n0 n0Var3 = null;
        n0 n0Var4 = null;
        n0 n0Var5 = null;
        r0 r0Var = null;
        r0 r0Var2 = null;
        r0 r0Var3 = null;
        n0 n0Var6 = null;
        n0 n0Var7 = null;
        n0 n0Var8 = null;
        n0 n0Var9 = null;
        n0 n0Var10 = null;
        n0 n0Var11 = null;
        t0 t0Var = null;
        n0 n0Var12 = null;
        n0 n0Var13 = null;
        n0 n0Var14 = null;
        n0 n0Var15 = null;
        n0 n0Var16 = null;
        switch (i) {
            case 1:
                j21.a M = j21.b.M(parcel.readStrongBinder());
                u0 u0Var = (u0) z.a(parcel, u0.CREATOR);
                long readLong = parcel.readLong();
                z.d(parcel);
                initialize(M, u0Var, readLong);
                break;
            case 2:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Bundle bundle = (Bundle) z.a(parcel, Bundle.CREATOR);
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                long readLong2 = parcel.readLong();
                z.d(parcel);
                logEvent(readString, readString2, bundle, z2, z3, readLong2);
                break;
            case 3:
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                Bundle bundle2 = (Bundle) z.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    n0Var = queryLocalInterface instanceof n0 ? (n0) queryLocalInterface : new m0(readStrongBinder);
                }
                n0 n0Var17 = n0Var;
                long readLong3 = parcel.readLong();
                z.d(parcel);
                logEventAndBundle(readString3, readString4, bundle2, n0Var17, readLong3);
                break;
            case 4:
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                j21.a M2 = j21.b.M(parcel.readStrongBinder());
                ClassLoader classLoader = z.a;
                z = parcel.readInt() != 0;
                long readLong4 = parcel.readLong();
                z.d(parcel);
                setUserProperty(readString5, readString6, M2, z, readLong4);
                break;
            case 5:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                ClassLoader classLoader2 = z.a;
                z = parcel.readInt() != 0;
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    n0Var16 = queryLocalInterface2 instanceof n0 ? (n0) queryLocalInterface2 : new m0(readStrongBinder2);
                }
                z.d(parcel);
                getUserProperties(readString7, readString8, z, n0Var16);
                break;
            case 6:
                String readString9 = parcel.readString();
                IBinder readStrongBinder3 = parcel.readStrongBinder();
                if (readStrongBinder3 != null) {
                    IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    n0Var15 = queryLocalInterface3 instanceof n0 ? (n0) queryLocalInterface3 : new m0(readStrongBinder3);
                }
                z.d(parcel);
                getMaxUserProperties(readString9, n0Var15);
                break;
            case 7:
                String readString10 = parcel.readString();
                long readLong5 = parcel.readLong();
                z.d(parcel);
                setUserId(readString10, readLong5);
                break;
            case 8:
                Bundle bundle3 = (Bundle) z.a(parcel, Bundle.CREATOR);
                long readLong6 = parcel.readLong();
                z.d(parcel);
                setConditionalUserProperty(bundle3, readLong6);
                break;
            case 9:
                String readString11 = parcel.readString();
                String readString12 = parcel.readString();
                Bundle bundle4 = (Bundle) z.a(parcel, Bundle.CREATOR);
                z.d(parcel);
                clearConditionalUserProperty(readString11, readString12, bundle4);
                break;
            case 10:
                String readString13 = parcel.readString();
                String readString14 = parcel.readString();
                IBinder readStrongBinder4 = parcel.readStrongBinder();
                if (readStrongBinder4 != null) {
                    IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    n0Var14 = queryLocalInterface4 instanceof n0 ? (n0) queryLocalInterface4 : new m0(readStrongBinder4);
                }
                z.d(parcel);
                getConditionalUserProperties(readString13, readString14, n0Var14);
                break;
            case 11:
                ClassLoader classLoader3 = z.a;
                z = parcel.readInt() != 0;
                long readLong7 = parcel.readLong();
                z.d(parcel);
                setMeasurementEnabled(z, readLong7);
                break;
            case 12:
                long readLong8 = parcel.readLong();
                z.d(parcel);
                resetAnalyticsData(readLong8);
                break;
            case 13:
                long readLong9 = parcel.readLong();
                z.d(parcel);
                setMinimumSessionDuration(readLong9);
                break;
            case 14:
                long readLong10 = parcel.readLong();
                z.d(parcel);
                setSessionTimeoutDuration(readLong10);
                break;
            case 15:
                j21.a M3 = j21.b.M(parcel.readStrongBinder());
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                long readLong11 = parcel.readLong();
                z.d(parcel);
                setCurrentScreen(M3, readString15, readString16, readLong11);
                break;
            case 16:
                IBinder readStrongBinder5 = parcel.readStrongBinder();
                if (readStrongBinder5 != null) {
                    IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    n0Var13 = queryLocalInterface5 instanceof n0 ? (n0) queryLocalInterface5 : new m0(readStrongBinder5);
                }
                z.d(parcel);
                getCurrentScreenName(n0Var13);
                break;
            case 17:
                IBinder readStrongBinder6 = parcel.readStrongBinder();
                if (readStrongBinder6 != null) {
                    IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    n0Var12 = queryLocalInterface6 instanceof n0 ? (n0) queryLocalInterface6 : new m0(readStrongBinder6);
                }
                z.d(parcel);
                getCurrentScreenClass(n0Var12);
                break;
            case 18:
                IBinder readStrongBinder7 = parcel.readStrongBinder();
                if (readStrongBinder7 != null) {
                    IInterface queryLocalInterface7 = readStrongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    t0Var = queryLocalInterface7 instanceof t0 ? (t0) queryLocalInterface7 : new s0(readStrongBinder7, "com.google.android.gms.measurement.api.internal.IStringProvider", 0);
                }
                z.d(parcel);
                setInstanceIdProvider(t0Var);
                break;
            case 19:
                IBinder readStrongBinder8 = parcel.readStrongBinder();
                if (readStrongBinder8 != null) {
                    IInterface queryLocalInterface8 = readStrongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    n0Var11 = queryLocalInterface8 instanceof n0 ? (n0) queryLocalInterface8 : new m0(readStrongBinder8);
                }
                z.d(parcel);
                getCachedAppInstanceId(n0Var11);
                break;
            case 20:
                IBinder readStrongBinder9 = parcel.readStrongBinder();
                if (readStrongBinder9 != null) {
                    IInterface queryLocalInterface9 = readStrongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    n0Var10 = queryLocalInterface9 instanceof n0 ? (n0) queryLocalInterface9 : new m0(readStrongBinder9);
                }
                z.d(parcel);
                getAppInstanceId(n0Var10);
                break;
            case 21:
                IBinder readStrongBinder10 = parcel.readStrongBinder();
                if (readStrongBinder10 != null) {
                    IInterface queryLocalInterface10 = readStrongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    n0Var9 = queryLocalInterface10 instanceof n0 ? (n0) queryLocalInterface10 : new m0(readStrongBinder10);
                }
                z.d(parcel);
                getGmpAppId(n0Var9);
                break;
            case 22:
                IBinder readStrongBinder11 = parcel.readStrongBinder();
                if (readStrongBinder11 != null) {
                    IInterface queryLocalInterface11 = readStrongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    n0Var8 = queryLocalInterface11 instanceof n0 ? (n0) queryLocalInterface11 : new m0(readStrongBinder11);
                }
                z.d(parcel);
                generateEventId(n0Var8);
                break;
            case 23:
                String readString17 = parcel.readString();
                long readLong12 = parcel.readLong();
                z.d(parcel);
                beginAdUnitExposure(readString17, readLong12);
                break;
            case 24:
                String readString18 = parcel.readString();
                long readLong13 = parcel.readLong();
                z.d(parcel);
                endAdUnitExposure(readString18, readLong13);
                break;
            case 25:
                j21.a M4 = j21.b.M(parcel.readStrongBinder());
                long readLong14 = parcel.readLong();
                z.d(parcel);
                onActivityStarted(M4, readLong14);
                break;
            case 26:
                j21.a M5 = j21.b.M(parcel.readStrongBinder());
                long readLong15 = parcel.readLong();
                z.d(parcel);
                onActivityStopped(M5, readLong15);
                break;
            case 27:
                j21.a M6 = j21.b.M(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) z.a(parcel, Bundle.CREATOR);
                long readLong16 = parcel.readLong();
                z.d(parcel);
                onActivityCreated(M6, bundle5, readLong16);
                break;
            case 28:
                j21.a M7 = j21.b.M(parcel.readStrongBinder());
                long readLong17 = parcel.readLong();
                z.d(parcel);
                onActivityDestroyed(M7, readLong17);
                break;
            case 29:
                j21.a M8 = j21.b.M(parcel.readStrongBinder());
                long readLong18 = parcel.readLong();
                z.d(parcel);
                onActivityPaused(M8, readLong18);
                break;
            case 30:
                j21.a M9 = j21.b.M(parcel.readStrongBinder());
                long readLong19 = parcel.readLong();
                z.d(parcel);
                onActivityResumed(M9, readLong19);
                break;
            case 31:
                j21.a M10 = j21.b.M(parcel.readStrongBinder());
                IBinder readStrongBinder12 = parcel.readStrongBinder();
                if (readStrongBinder12 != null) {
                    IInterface queryLocalInterface12 = readStrongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    n0Var7 = queryLocalInterface12 instanceof n0 ? (n0) queryLocalInterface12 : new m0(readStrongBinder12);
                }
                long readLong20 = parcel.readLong();
                z.d(parcel);
                onActivitySaveInstanceState(M10, n0Var7, readLong20);
                break;
            case 32:
                Bundle bundle6 = (Bundle) z.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder13 = parcel.readStrongBinder();
                if (readStrongBinder13 != null) {
                    IInterface queryLocalInterface13 = readStrongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    n0Var6 = queryLocalInterface13 instanceof n0 ? (n0) queryLocalInterface13 : new m0(readStrongBinder13);
                }
                long readLong21 = parcel.readLong();
                z.d(parcel);
                performAction(bundle6, n0Var6, readLong21);
                break;
            case 33:
                int readInt = parcel.readInt();
                String readString19 = parcel.readString();
                j21.a M11 = j21.b.M(parcel.readStrongBinder());
                j21.a M12 = j21.b.M(parcel.readStrongBinder());
                j21.a M13 = j21.b.M(parcel.readStrongBinder());
                z.d(parcel);
                logHealthData(readInt, readString19, M11, M12, M13);
                break;
            case 34:
                IBinder readStrongBinder14 = parcel.readStrongBinder();
                if (readStrongBinder14 != null) {
                    IInterface queryLocalInterface14 = readStrongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    r0Var3 = queryLocalInterface14 instanceof r0 ? (r0) queryLocalInterface14 : new q0(readStrongBinder14);
                }
                z.d(parcel);
                setEventInterceptor(r0Var3);
                break;
            case 35:
                IBinder readStrongBinder15 = parcel.readStrongBinder();
                if (readStrongBinder15 != null) {
                    IInterface queryLocalInterface15 = readStrongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    r0Var2 = queryLocalInterface15 instanceof r0 ? (r0) queryLocalInterface15 : new q0(readStrongBinder15);
                }
                z.d(parcel);
                registerOnMeasurementEventListener(r0Var2);
                break;
            case 36:
                IBinder readStrongBinder16 = parcel.readStrongBinder();
                if (readStrongBinder16 != null) {
                    IInterface queryLocalInterface16 = readStrongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    r0Var = queryLocalInterface16 instanceof r0 ? (r0) queryLocalInterface16 : new q0(readStrongBinder16);
                }
                z.d(parcel);
                unregisterOnMeasurementEventListener(r0Var);
                break;
            case 37:
                HashMap readHashMap = parcel.readHashMap(z.a);
                z.d(parcel);
                initForTests(readHashMap);
                break;
            case 38:
                IBinder readStrongBinder17 = parcel.readStrongBinder();
                if (readStrongBinder17 != null) {
                    IInterface queryLocalInterface17 = readStrongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    n0Var5 = queryLocalInterface17 instanceof n0 ? (n0) queryLocalInterface17 : new m0(readStrongBinder17);
                }
                int readInt2 = parcel.readInt();
                z.d(parcel);
                getTestFlag(n0Var5, readInt2);
                break;
            case 39:
                ClassLoader classLoader4 = z.a;
                z = parcel.readInt() != 0;
                z.d(parcel);
                setDataCollectionEnabled(z);
                break;
            case 40:
                IBinder readStrongBinder18 = parcel.readStrongBinder();
                if (readStrongBinder18 != null) {
                    IInterface queryLocalInterface18 = readStrongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    n0Var4 = queryLocalInterface18 instanceof n0 ? (n0) queryLocalInterface18 : new m0(readStrongBinder18);
                }
                z.d(parcel);
                isDataCollectionEnabled(n0Var4);
                break;
            case 41:
            case 47:
            case 49:
            default:
                return false;
            case 42:
                Bundle bundle7 = (Bundle) z.a(parcel, Bundle.CREATOR);
                z.d(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case 43:
                long readLong22 = parcel.readLong();
                z.d(parcel);
                clearMeasurementEnabled(readLong22);
                break;
            case 44:
                Bundle bundle8 = (Bundle) z.a(parcel, Bundle.CREATOR);
                long readLong23 = parcel.readLong();
                z.d(parcel);
                setConsent(bundle8, readLong23);
                break;
            case 45:
                Bundle bundle9 = (Bundle) z.a(parcel, Bundle.CREATOR);
                long readLong24 = parcel.readLong();
                z.d(parcel);
                setConsentThirdParty(bundle9, readLong24);
                break;
            case 46:
                IBinder readStrongBinder19 = parcel.readStrongBinder();
                if (readStrongBinder19 != null) {
                    IInterface queryLocalInterface19 = readStrongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    n0Var3 = queryLocalInterface19 instanceof n0 ? (n0) queryLocalInterface19 : new m0(readStrongBinder19);
                }
                z.d(parcel);
                getSessionId(n0Var3);
                break;
            case 48:
                Intent intent = (Intent) z.a(parcel, Intent.CREATOR);
                z.d(parcel);
                setSgtmDebugInfo(intent);
                break;
            case 50:
                w0 w0Var = (w0) z.a(parcel, w0.CREATOR);
                String readString20 = parcel.readString();
                String readString21 = parcel.readString();
                long readLong25 = parcel.readLong();
                z.d(parcel);
                setCurrentScreenByScionActivityInfo(w0Var, readString20, readString21, readLong25);
                break;
            case 51:
                w0 w0Var2 = (w0) z.a(parcel, w0.CREATOR);
                long readLong26 = parcel.readLong();
                z.d(parcel);
                onActivityStartedByScionActivityInfo(w0Var2, readLong26);
                break;
            case 52:
                w0 w0Var3 = (w0) z.a(parcel, w0.CREATOR);
                long readLong27 = parcel.readLong();
                z.d(parcel);
                onActivityStoppedByScionActivityInfo(w0Var3, readLong27);
                break;
            case 53:
                w0 w0Var4 = (w0) z.a(parcel, w0.CREATOR);
                Bundle bundle10 = (Bundle) z.a(parcel, Bundle.CREATOR);
                long readLong28 = parcel.readLong();
                z.d(parcel);
                onActivityCreatedByScionActivityInfo(w0Var4, bundle10, readLong28);
                break;
            case 54:
                w0 w0Var5 = (w0) z.a(parcel, w0.CREATOR);
                long readLong29 = parcel.readLong();
                z.d(parcel);
                onActivityDestroyedByScionActivityInfo(w0Var5, readLong29);
                break;
            case 55:
                w0 w0Var6 = (w0) z.a(parcel, w0.CREATOR);
                long readLong30 = parcel.readLong();
                z.d(parcel);
                onActivityPausedByScionActivityInfo(w0Var6, readLong30);
                break;
            case 56:
                w0 w0Var7 = (w0) z.a(parcel, w0.CREATOR);
                long readLong31 = parcel.readLong();
                z.d(parcel);
                onActivityResumedByScionActivityInfo(w0Var7, readLong31);
                break;
            case 57:
                w0 w0Var8 = (w0) z.a(parcel, w0.CREATOR);
                IBinder readStrongBinder20 = parcel.readStrongBinder();
                if (readStrongBinder20 != null) {
                    IInterface queryLocalInterface20 = readStrongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    n0Var2 = queryLocalInterface20 instanceof n0 ? (n0) queryLocalInterface20 : new m0(readStrongBinder20);
                }
                long readLong32 = parcel.readLong();
                z.d(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(w0Var8, n0Var2, readLong32);
                break;
            case 58:
                IBinder readStrongBinder21 = parcel.readStrongBinder();
                if (readStrongBinder21 != null) {
                    IInterface queryLocalInterface21 = readStrongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    p0Var = queryLocalInterface21 instanceof p0 ? (p0) queryLocalInterface21 : new o0(readStrongBinder21, "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback", 0);
                }
                z.d(parcel);
                retrieveAndUploadBatches(p0Var);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
