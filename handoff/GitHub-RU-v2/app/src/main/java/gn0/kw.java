package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class kw {
    public static final /* synthetic */ d71.b A;
    public static final jw Companion;
    public static final aa.a0 s;
    public static final kw t;
    public static final kw u;
    public static final kw v;
    public static final kw w;
    public static final kw x;
    public static final kw y;
    public static final /* synthetic */ kw[] z;
    public final String r;

    static {
        kw kwVar = new kw("CUSTOM", 0, "CUSTOM");
        t = kwVar;
        kw kwVar2 = new kw("IGNORED", 1, "IGNORED");
        u = kwVar2;
        kw kwVar3 = new kw("RELEASES_ONLY", 2, "RELEASES_ONLY");
        v = kwVar3;
        kw kwVar4 = new kw("SUBSCRIBED", 3, "SUBSCRIBED");
        w = kwVar4;
        kw kwVar5 = new kw("UNSUBSCRIBED", 4, "UNSUBSCRIBED");
        x = kwVar5;
        kw kwVar6 = new kw("UNKNOWN__", 5, "UNKNOWN__");
        y = kwVar6;
        kw[] kwVarArr = {kwVar, kwVar2, kwVar3, kwVar4, kwVar5, kwVar6};
        z = kwVarArr;
        A = v8.l0.t(kwVarArr);
        Companion = new jw();
        x61.l.r(new String[]{"CUSTOM", "IGNORED", "RELEASES_ONLY", "SUBSCRIBED", "UNSUBSCRIBED"});
        s = new aa.a0("SubscriptionState");
    }

    public kw(String str, int i, String str2) {
        this.r = str2;
    }

    public static kw valueOf(String str) {
        return (kw) Enum.valueOf(kw.class, str);
    }

    public static kw[] values() {
        return (kw[]) z.clone();
    }
    public Object ordinal() { return null; }
}
