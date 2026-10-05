package net.openid.appauth;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import androidx.lifecycle.l1;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class k {
    public static Map a(Map map, Set set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            d(str, "additional parameter keys cannot be null");
            d(str2, "additional parameter values cannot be null");
            if (set.contains(str)) {
                throw new IllegalArgumentException(f1.e.z("Parameter ", str, " is directly supported via the authorization request builder, use the builder method instead"));
            }
            linkedHashMap.put(str, str2);
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    public static void b(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void c(String str, String str2) {
        d(str, str2);
        b(str2, !TextUtils.isEmpty(str));
    }

    public static void d(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static String f(JSONObject jSONObject, String str) {
        d(jSONObject, "json must not be null");
        if (!jSONObject.has(str)) {
            throw new JSONException(f1.e.z("field \"", str, "\" not found in json object"));
        }
        String string = jSONObject.getString(str);
        if (string != null) {
            return string;
        }
        throw new JSONException(f1.e.z("field \"", str, "\" is mapped to a null value"));
    }

    public static String g(JSONObject jSONObject, String str) {
        d(jSONObject, "json must not be null");
        if (!jSONObject.has(str)) {
            return null;
        }
        String string = jSONObject.getString(str);
        if (string != null) {
            return string;
        }
        throw new JSONException(f1.e.z("field \"", str, "\" is mapped to a null value"));
    }

    public static LinkedHashMap h(JSONObject jSONObject, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d(jSONObject, "json must not be null");
        if (jSONObject.has(str)) {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String string = jSONObject2.getString(next);
                d(string, "additional parameter values must not be null");
                linkedHashMap.put(next, string);
            }
        }
        return linkedHashMap;
    }

    public static Uri i(JSONObject jSONObject, String str) {
        d(jSONObject, "json must not be null");
        String string = jSONObject.getString(str);
        if (string != null) {
            return Uri.parse(string);
        }
        throw new JSONException(f1.e.z("field \"", str, "\" is mapped to a null value"));
    }

    public static Uri j(JSONObject jSONObject, String str) {
        d(jSONObject, "json must not be null");
        if (!jSONObject.has(str)) {
            return null;
        }
        String string = jSONObject.getString(str);
        if (string != null) {
            return Uri.parse(string);
        }
        throw new JSONException(f1.e.z("field \"", str, "\" is mapped to a null value"));
    }

    public static final boolean k(AuthorizationException authorizationException) {
        return false;
    }

    public static String l(List list) {
        if (list == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            b("individual scopes cannot be null or empty", !TextUtils.isEmpty(str));
            linkedHashSet.add(str);
        }
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return TextUtils.join(" ", linkedHashSet);
    }

    public static JSONObject m(Map map) {
        map.getClass();
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            d((String) entry.getKey(), "map entries must not have null keys");
            d((String) entry.getValue(), "map entries must not have null values");
            n(jSONObject, (String) entry.getKey(), (String) entry.getValue());
        }
        return jSONObject;
    }

    public static void n(JSONObject jSONObject, String str, String str2) {
        d(str, "field must not be null");
        d(str2, "value must not be null");
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e);
        }
    }

    public static void o(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        d(jSONObject2, "value must not be null");
        try {
            jSONObject.put(str, jSONObject2);
        } catch (JSONException e) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e);
        }
    }

    public static void p(JSONObject jSONObject, String str, Uri uri) {
        if (uri == null) {
            return;
        }
        try {
            jSONObject.put(str, uri.toString());
        } catch (JSONException e) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e);
        }
    }

    public static void q(JSONObject jSONObject, String str, String str2) {
        if (str2 == null) {
            return;
        }
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e);
        }
    }

    public static d r(String str, String str2) {
        JSONObject jSONObject = new JSONObject(str);
        if ("authorization".equals(str2)) {
            return e.b(jSONObject);
        }
        if ("end_session".equals(str2)) {
            return new i(l1.q(jSONObject.getJSONObject("configuration")), g(jSONObject, "id_token_hint"), j(jSONObject, "post_logout_redirect_uri"), g(jSONObject, "state"), g(jSONObject, "ui_locales"), h(jSONObject, "additionalParameters"));
        }
        throw new IllegalArgumentException("No AuthorizationManagementRequest found matching to this json schema");
    }

    public abstract String e();

    public abstract Intent s();







}
