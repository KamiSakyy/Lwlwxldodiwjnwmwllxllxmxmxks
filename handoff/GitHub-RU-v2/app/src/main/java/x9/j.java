package x9;

import org.json.JSONObject;

/* loaded from: /home/user/work/p/classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public String f34012a;

    public j(JSONObject jSONObject) {
        jSONObject.optString("billingPeriod");
        jSONObject.optString("priceCurrencyCode");
        this.f34012a = jSONObject.optString("formattedPrice");
        jSONObject.optLong("priceAmountMicros");
        jSONObject.optInt("recurrenceMode");
        jSONObject.optInt("billingCycleCount");
    }
}
