package hc0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class pl {
    public static final ol Companion;
    public static final pl s;
    public static final pl t;
    public static final pl u;
    public static final pl v;
    public static final pl w;
    public static final /* synthetic */ pl[] x;
    public static final /* synthetic */ d71.b y;
    public String r;

    static {
        pl plVar = new pl("APPROVE", 0, "APPROVE");
        s = plVar;
        pl plVar2 = new pl("COMMENT", 1, "COMMENT");
        t = plVar2;
        pl plVar3 = new pl("DISMISS", 2, "DISMISS");
        u = plVar3;
        pl plVar4 = new pl("REQUEST_CHANGES", 3, "REQUEST_CHANGES");
        v = plVar4;
        pl plVar5 = new pl("UNKNOWN__", 4, "UNKNOWN__");
        w = plVar5;
        pl[] plVarArr = {plVar, plVar2, plVar3, plVar4, plVar5};
        x = plVarArr;
        y = v8.l0.t(plVarArr);
        Companion = new ol();
        sy.d0.o(new String[]{"APPROVE", "COMMENT", "DISMISS", "REQUEST_CHANGES"});
    }

    public pl(String str, int i, String str2) {
        this.r = str2;
    }

    public static pl valueOf(String str) {
        return (pl) Enum.valueOf(pl.class, str);
    }

    public static pl[] values() {
        return (pl[]) x.clone();
    }
}
