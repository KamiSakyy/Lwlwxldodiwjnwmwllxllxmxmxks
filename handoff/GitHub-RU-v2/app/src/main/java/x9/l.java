package x9;

import android.text.TextUtils;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: /home/user/work/p/classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public String f34015a;

    /* renamed from: b, reason: collision with root package name */
    public JSONObject f34016b;

    /* renamed from: c, reason: collision with root package name */
    public String f34017c;

    /* renamed from: d, reason: collision with root package name */
    public String f34018d;

    /* renamed from: e, reason: collision with root package name */
    public String f34019e;

    /* renamed from: f, reason: collision with root package name */
    public String f34020f;

    /* renamed from: g, reason: collision with root package name */
    public String f34021g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f34022h;
    public ArrayList i;

    public l(String str) {
        this.f34015a = str;
        JSONObject jSONObject = new JSONObject(str);
        this.f34016b = jSONObject;
        String optString = jSONObject.optString("productId");
        this.f34017c = optString;
        String optString2 = jSONObject.optString("type");
        this.f34018d = optString2;
        if (TextUtils.isEmpty(optString)) {
            throw new IllegalArgumentException("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(optString2)) {
            throw new IllegalArgumentException("Product type cannot be empty.");
        }
        this.f34019e = jSONObject.optString("title");
        jSONObject.optString("name");
        jSONObject.optString("description");
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.f34020f = jSONObject.optString("skuDetailsToken");
        this.f34021g = jSONObject.optString("serializedDocid");
        JSONArray optJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                arrayList.add(new k(optJSONArray.getJSONObject(i)));
            }
            this.f34022h = arrayList;
        } else {
            this.f34022h = (optString2.equals("subs") || optString2.equals("play_pass_subs")) ? new ArrayList() : null;
        }
        JSONObject optJSONObject = this.f34016b.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray optJSONArray2 = this.f34016b.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayList2 = new ArrayList();
        if (optJSONArray2 != null) {
            for (int i10 = 0; i10 < optJSONArray2.length(); i10++) {
                arrayList2.add(new i(optJSONArray2.getJSONObject(i10)));
            }
            this.i = arrayList2;
            return;
        }
        if (optJSONObject == null) {
            this.i = null;
        } else {
            arrayList2.add(new i(optJSONObject));
            this.i = arrayList2;
        }
    }

    public final i a() {
        ArrayList arrayList = this.i;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (i) arrayList.get(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return TextUtils.equals(this.f34015a, ((l) obj).f34015a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34015a.hashCode();
    }

    public final String toString() {
        String obj = this.f34016b.toString();
        String valueOf = String.valueOf(this.f34022h);
        StringBuilder sb2 = new StringBuilder("ProductDetails{jsonString='");
        f1.e.x(sb2, this.f34015a, "', parsedJson=", obj, ", productId='");
        sb2.append(this.f34017c);
        sb2.append("', productType='");
        sb2.append(this.f34018d);
        sb2.append("', title='");
        sb2.append(this.f34019e);
        sb2.append("', productDetailsToken='");
        return x.i.k(sb2, this.f34020f, "', subscriptionOfferDetails=", valueOf, "}");
    }
    public Object h = null;
}
