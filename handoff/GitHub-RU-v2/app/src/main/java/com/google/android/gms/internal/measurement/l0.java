package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* loaded from: /home/user/work/p/classes4.dex */
public interface l0 extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(n0 n0Var);

    void getAppInstanceId(n0 n0Var);

    void getCachedAppInstanceId(n0 n0Var);

    void getConditionalUserProperties(String str, String str2, n0 n0Var);

    void getCurrentScreenClass(n0 n0Var);

    void getCurrentScreenName(n0 n0Var);

    void getGmpAppId(n0 n0Var);

    void getMaxUserProperties(String str, n0 n0Var);

    void getSessionId(n0 n0Var);

    void getTestFlag(n0 n0Var, int i);

    void getUserProperties(String str, String str2, boolean z, n0 n0Var);

    void initForTests(Map map);

    void initialize(j21.a aVar, u0 u0Var, long j);

    void isDataCollectionEnabled(n0 n0Var);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, n0 n0Var, long j);

    void logHealthData(int i, String str, j21.a aVar, j21.a aVar2, j21.a aVar3);

    void onActivityCreated(j21.a aVar, Bundle bundle, long j);

    void onActivityCreatedByScionActivityInfo(w0 w0Var, Bundle bundle, long j);

    void onActivityDestroyed(j21.a aVar, long j);

    void onActivityDestroyedByScionActivityInfo(w0 w0Var, long j);

    void onActivityPaused(j21.a aVar, long j);

    void onActivityPausedByScionActivityInfo(w0 w0Var, long j);

    void onActivityResumed(j21.a aVar, long j);

    void onActivityResumedByScionActivityInfo(w0 w0Var, long j);

    void onActivitySaveInstanceState(j21.a aVar, n0 n0Var, long j);

    void onActivitySaveInstanceStateByScionActivityInfo(w0 w0Var, n0 n0Var, long j);

    void onActivityStarted(j21.a aVar, long j);

    void onActivityStartedByScionActivityInfo(w0 w0Var, long j);

    void onActivityStopped(j21.a aVar, long j);

    void onActivityStoppedByScionActivityInfo(w0 w0Var, long j);

    void performAction(Bundle bundle, n0 n0Var, long j);

    void registerOnMeasurementEventListener(r0 r0Var);

    void resetAnalyticsData(long j);

    void retrieveAndUploadBatches(p0 p0Var);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(j21.a aVar, String str, String str2, long j);

    void setCurrentScreenByScionActivityInfo(w0 w0Var, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(r0 r0Var);

    void setInstanceIdProvider(t0 t0Var);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, j21.a aVar, boolean z, long j);

    void unregisterOnMeasurementEventListener(r0 r0Var);
}
