package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class kk {
    public static final jk Companion;
    public static final aa.a0 s;
    public static final kk t;
    public static final /* synthetic */ kk[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        kk kkVar = new kk("OFF_TOPIC", 0, "OFF_TOPIC");
        kk kkVar2 = new kk("RESOLVED", 1, "RESOLVED");
        kk kkVar3 = new kk("SPAM", 2, "SPAM");
        kk kkVar4 = new kk("TOO_HEATED", 3, "TOO_HEATED");
        kk kkVar5 = new kk("UNKNOWN__", 4, "UNKNOWN__");
        t = kkVar5;
        kk[] kkVarArr = {kkVar, kkVar2, kkVar3, kkVar4, kkVar5};
        u = kkVarArr;
        v = v8.l0.t(kkVarArr);
        Companion = new jk();
        x61.l.r(new String[]{"OFF_TOPIC", "RESOLVED", "SPAM", "TOO_HEATED"});
        s = new aa.a0("LockReason");
    }

    public kk(String str, int i, String str2) {
        this.r = str2;
    }

    public static kk valueOf(String str) {
        return (kk) Enum.valueOf(kk.class, str);
    }

    public static kk[] values() {
        return (kk[]) u.clone();
    }
}
