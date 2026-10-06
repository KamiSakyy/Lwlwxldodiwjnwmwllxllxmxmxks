package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class kv {
    public static final jv Companion;
    public static final aa.a0 s;
    public static final kv t;
    public static final kv u;
    public static final /* synthetic */ kv[] v;
    public static final /* synthetic */ d71.b w;
    public final String r;

    static {
        kv kvVar = new kv("EMAIL", 0, "EMAIL");
        t = kvVar;
        kv kvVar2 = new kv("URL", 1, "URL");
        kv kvVar3 = new kv("UNKNOWN__", 2, "UNKNOWN__");
        u = kvVar3;
        kv[] kvVarArr = {kvVar, kvVar2, kvVar3};
        v = kvVarArr;
        w = v8.l0.t(kvVarArr);
        Companion = new jv();
        x61.l.r(new String[]{"EMAIL", "URL"});
        s = new aa.a0("SupportLinkType");
    }

    public kv(String str, int i, String str2) {
        this.r = str2;
    }

    public static kv valueOf(String str) {
        return (kv) Enum.valueOf(kv.class, str);
    }

    public static kv[] values() {
        return (kv[]) v.clone();
    }
}
