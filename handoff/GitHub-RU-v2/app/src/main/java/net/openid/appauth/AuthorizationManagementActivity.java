package net.openid.appauth;

import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* loaded from: /home/user/work/p/classes5.dex */
public class AuthorizationManagementActivity extends k.i {
    public static final /* synthetic */ int X = 0;
    public boolean S = false;
    public Intent T;
    public d U;
    public PendingIntent V;
    public PendingIntent W;

    /* JADX WARN: Multi-variable type inference failed */
    public final void Y(Bundle bundle) {
        if (bundle == null) {
            p81.a.d().e(5, "No stored state - unable to handle response", new Object[0]);
            finish();
            return;
        }
        this.T = (Intent) bundle.getParcelable("authIntent");
        this.S = bundle.getBoolean("authStarted", false);
        this.V = (PendingIntent) bundle.getParcelable("completeIntent");
        this.W = (PendingIntent) bundle.getParcelable("cancelIntent");
        try {
            String string = bundle.getString("authRequest", null);
            this.U = string != null ? k.r(string, bundle.getString("authRequestType", null)) : null;
        } catch (JSONException unused) {
            Z(this.W, b.a.d(), 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Z(PendingIntent pendingIntent, Intent intent, int i) {
        if (pendingIntent == null) {
            setResult(i, intent);
            return;
        }
        try {
            pendingIntent.send((Context) this, 0, intent);
        } catch (PendingIntent.CanceledException e) {
            p81.a.d().e(6, "Failed to send cancel intent", e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            Y(getIntent().getExtras());
        } else {
            Y(bundle);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onNewIntent(Intent intent) {
        super/*d.j*/.onNewIntent(intent);
        setIntent(intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onResume() {
        k jVar;
        Intent s;
        String[] split;
        super.onResume();
        if (!this.S) {
            try {
                startActivity(this.T);
                this.S = true;
                return;
            } catch (ActivityNotFoundException unused) {
                p81.a.c("Authorization flow canceled due to missing browser", new Object[0]);
                AuthorizationException authorizationException = c.b;
                Z(this.W, new AuthorizationException(authorizationException.r, authorizationException.s, authorizationException.t, authorizationException.u, authorizationException.v).d(), 0);
                finish();
                return;
            }
        }
        if (getIntent().getData() != null) {
            Uri data = getIntent().getData();
            if (data.getQueryParameterNames().contains("error")) {
                int i = AuthorizationException.w;
                String queryParameter = data.getQueryParameter("error");
                String queryParameter2 = data.getQueryParameter("error_description");
                String queryParameter3 = data.getQueryParameter("error_uri");
                AuthorizationException authorizationException2 = (AuthorizationException) b.d.get(queryParameter);
                if (authorizationException2 == null) {
                    authorizationException2 = b.b;
                }
                AuthorizationException authorizationException3 = authorizationException2;
                int i2 = authorizationException3.r;
                int i3 = authorizationException3.s;
                if (queryParameter2 == null) {
                    queryParameter2 = authorizationException3.u;
                }
                s = new AuthorizationException(i2, i3, queryParameter, queryParameter2, queryParameter3 != null ? Uri.parse(queryParameter3) : authorizationException3.v).d();
            } else {
                d dVar = this.U;
                if (dVar instanceof e) {
                    e eVar = (e) dVar;
                    new LinkedHashMap();
                    String queryParameter4 = data.getQueryParameter("state");
                    if (queryParameter4 != null) {
                        k.c(queryParameter4, "state must not be empty");
                    }
                    String queryParameter5 = data.getQueryParameter("token_type");
                    if (queryParameter5 != null) {
                        k.c(queryParameter5, "tokenType must not be empty");
                    }
                    String queryParameter6 = data.getQueryParameter("code");
                    if (queryParameter6 != null) {
                        k.c(queryParameter6, "authorizationCode must not be empty");
                    }
                    String queryParameter7 = data.getQueryParameter("access_token");
                    if (queryParameter7 != null) {
                        k.c(queryParameter7, "accessToken must not be empty");
                    }
                    String queryParameter8 = data.getQueryParameter("expires_in");
                    String str = null;
                    Long valueOf = queryParameter8 != null ? Long.valueOf(Long.parseLong(queryParameter8)) : null;
                    Long valueOf2 = valueOf == null ? null : Long.valueOf(TimeUnit.SECONDS.toMillis(valueOf.longValue()) + System.currentTimeMillis());
                    String queryParameter9 = data.getQueryParameter("id_token");
                    if (queryParameter9 != null) {
                        k.c(queryParameter9, "idToken cannot be empty");
                    }
                    String queryParameter10 = data.getQueryParameter("scope");
                    if (!TextUtils.isEmpty(queryParameter10) && (split = queryParameter10.split(" +")) != null) {
                        str = k.l(Arrays.asList(split));
                    }
                    String str2 = str;
                    Set set = f.j;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (String str3 : data.getQueryParameterNames()) {
                        if (!set.contains(str3)) {
                            linkedHashMap.put(str3, data.getQueryParameter(str3));
                        }
                    }
                    jVar = new f(eVar, queryParameter4, queryParameter5, queryParameter6, queryParameter7, valueOf2, queryParameter9, str2, Collections.unmodifiableMap(k.a(linkedHashMap, f.j)));
                } else {
                    if (!(dVar instanceof i)) {
                        throw new IllegalArgumentException("Malformed request or uri");
                    }
                    i iVar = (i) dVar;
                    String queryParameter11 = data.getQueryParameter("state");
                    if (queryParameter11 != null) {
                        k.c(queryParameter11, "state must not be empty");
                    }
                    jVar = new j(iVar, queryParameter11);
                }
                if ((this.U.getState() != null || jVar.e() == null) && (this.U.getState() == null || this.U.getState().equals(jVar.e()))) {
                    s = jVar.s();
                } else {
                    p81.a.d().e(5, "State returned in authorization response (%s) does not match state from request (%s) - discarding response", jVar.e(), this.U.getState());
                    s = b.c.d();
                }
            }
            s.setData(data);
            Z(this.V, s, -1);
        } else {
            p81.a.c("Authorization flow canceled by user", new Object[0]);
            AuthorizationException authorizationException4 = c.a;
            Z(this.W, new AuthorizationException(authorizationException4.r, authorizationException4.s, authorizationException4.t, authorizationException4.u, authorizationException4.v).d(), 0);
        }
        finish();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super/*d.j*/.onSaveInstanceState(bundle);
        bundle.putBoolean("authStarted", this.S);
        bundle.putParcelable("authIntent", this.T);
        bundle.putString("authRequest", this.U.a());
        d dVar = this.U;
        bundle.putString("authRequestType", dVar instanceof e ? "authorization" : dVar instanceof i ? "end_session" : null);
        bundle.putParcelable("completeIntent", this.V);
        bundle.putParcelable("cancelIntent", this.W);
    }

    public static  setResult(Object... a) {
        return null;
    }

    public static  getIntent(Object... a) {
        return null;
    }

    public static  setIntent(Object... a) {
        return null;
    }

    public static  startActivity(Object... a) {
        return null;
    }
}
