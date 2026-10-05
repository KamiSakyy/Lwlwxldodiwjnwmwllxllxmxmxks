package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class ig {
    public static final hg Companion;
    public static final aa.a0 s;
    public static final ig t;
    public static final /* synthetic */ ig[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        ig igVar = new ig("OFF_TOPIC", 0, "OFF_TOPIC");
        ig igVar2 = new ig("RESOLVED", 1, "RESOLVED");
        ig igVar3 = new ig("SPAM", 2, "SPAM");
        ig igVar4 = new ig("TOO_HEATED", 3, "TOO_HEATED");
        ig igVar5 = new ig("UNKNOWN__", 4, "UNKNOWN__");
        t = igVar5;
        ig[] igVarArr = {igVar, igVar2, igVar3, igVar4, igVar5};
        u = igVarArr;
        v = v8.l0.t(igVarArr);
        Companion = new hg();
        x61.l.r(new String[]{"OFF_TOPIC", "RESOLVED", "SPAM", "TOO_HEATED"});
        s = new aa.a0("LockReason");
    }

    public ig(String str, int i, String str2) {
        this.r = str2;
    }

    public static ig valueOf(String str) {
        return (ig) Enum.valueOf(ig.class, str);
    }

    public static ig[] values() {
        return (ig[]) u.clone();
    }
}
