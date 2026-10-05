package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class kl {
    public static final jl Companion;
    public static final kl s;
    public static final kl t;
    public static final /* synthetic */ kl[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        kl klVar = new kl("ARCHIVED", 0, "ARCHIVED");
        kl klVar2 = new kl("DONE", 1, "DONE");
        kl klVar3 = new kl("READ", 2, "READ");
        kl klVar4 = new kl("UNREAD", 3, "UNREAD");
        s = klVar4;
        kl klVar5 = new kl("UNKNOWN__", 4, "UNKNOWN__");
        t = klVar5;
        kl[] klVarArr = {klVar, klVar2, klVar3, klVar4, klVar5};
        u = klVarArr;
        v = v8.l0.t(klVarArr);
        Companion = new jl();
        sy.d0.o(new String[]{"ARCHIVED", "DONE", "READ", "UNREAD"});
    }

    public kl(String str, int i, String str2) {
        this.r = str2;
    }

    public static kl valueOf(String str) {
        return (kl) Enum.valueOf(kl.class, str);
    }

    public static kl[] values() {
        return (kl[]) u.clone();
    }
}
