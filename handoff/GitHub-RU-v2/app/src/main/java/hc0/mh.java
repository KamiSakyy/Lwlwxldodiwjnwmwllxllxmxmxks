package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class mh {
    public static final lh Companion;
    public static final mh s;
    public static final mh t;
    public static final /* synthetic */ mh[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        mh mhVar = new mh("ARCHIVED", 0, "ARCHIVED");
        mh mhVar2 = new mh("DONE", 1, "DONE");
        mh mhVar3 = new mh("READ", 2, "READ");
        mh mhVar4 = new mh("UNREAD", 3, "UNREAD");
        s = mhVar4;
        mh mhVar5 = new mh("UNKNOWN__", 4, "UNKNOWN__");
        t = mhVar5;
        mh[] mhVarArr = {mhVar, mhVar2, mhVar3, mhVar4, mhVar5};
        u = mhVarArr;
        v = v8.l0.t(mhVarArr);
        Companion = new lh();
        sy.d0.o(new String[]{"ARCHIVED", "DONE", "READ", "UNREAD"});
    }

    public mh(String str, int i, String str2) {
        this.r = str2;
    }

    public static mh valueOf(String str) {
        return (mh) Enum.valueOf(mh.class, str);
    }

    public static mh[] values() {
        return (mh[]) u.clone();
    }
}
