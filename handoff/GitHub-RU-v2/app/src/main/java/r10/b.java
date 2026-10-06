package r10;

import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public class b {
    public static final a Companion;
    public static final b s;
    public static final b t;
    public static final /* synthetic */ b[] u;
    public static final /* synthetic */ d71.b v;
    public String r;

    static {
        b bVar = new b("MOBILE_FEATURE_FLAGS", 0, "mobile_feature_flags");
        b bVar2 = new b("MOBILE_COPILOT_UPSELL_BANNER", 1, "mobile_copilot_upsell_banner");
        s = bVar2;
        b bVar3 = new b("MOBILE_COPILOT_O1_MIDCONVERSATION_MODEL_SWITCHING", 2, "mobile_copilot_o1_midconversation_model_switching_enabled");
        t = bVar3;
        b[] bVarArr = {bVar, bVar2, bVar3};
        u = bVarArr;
        v = l0.t(bVarArr);
        Companion = new a();
    }

    public b(String str, int i, String str2) {
        this.r = str2;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) u.clone();
    }
}
