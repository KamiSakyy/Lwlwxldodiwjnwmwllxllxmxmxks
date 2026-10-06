package com.android.billingclient.api;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /home/user/work/p/classes.dex */
public final class Purchase {

    /* renamed from: a, reason: collision with root package name */
    public String f4263a;

    /* renamed from: b, reason: collision with root package name */
    public String f4264b;

    /* renamed from: c, reason: collision with root package name */
    public JSONObject f4265c;

    public Purchase(String str, String str2) {
        this.f4263a = str;
        this.f4264b = str2;
        this.f4265c = new JSONObject(str);
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObject = this.f4265c;
        if (jSONObject.has("productIds")) {
            JSONArray optJSONArray = jSONObject.optJSONArray("productIds");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.optString(i));
                }
            }
        } else if (jSONObject.has("productId")) {
            arrayList.add(jSONObject.optString("productId"));
        }
        return arrayList;
    }

    public final String b() {
        JSONObject jSONObject = this.f4265c;
        return jSONObject.optString("token", jSONObject.optString("purchaseToken"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Purchase)) {
            return false;
        }
        Purchase purchase = (Purchase) obj;
        return TextUtils.equals(this.f4263a, purchase.f4263a) && TextUtils.equals(this.f4264b, purchase.f4264b);
    }

    public final int hashCode() {
        return this.f4263a.hashCode();
    }

    public final String toString() {
        return "Purchase. Json: ".concat(String.valueOf(this.f4263a));
    }
}
