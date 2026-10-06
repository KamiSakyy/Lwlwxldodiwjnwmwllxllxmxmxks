package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class we {
    public static final ve Companion;
    public static final we s;
    public static final we t;
    public static final we u;
    public static final we v;
    public static final we w;
    public static final /* synthetic */ we[] x;
    public static final /* synthetic */ d71.b y;
    public String r;

    static {
        we weVar = new we("DISMISSED", 0, "DISMISSED");
        s = weVar;
        we weVar2 = new we("EVENT_TYPE", 1, "EVENT_TYPE");
        t = weVar2;
        we weVar3 = new we("EVENT_TYPE_RESOURCE", 2, "EVENT_TYPE_RESOURCE");
        u = weVar3;
        we weVar4 = new we("RESOURCE", 3, "RESOURCE");
        v = weVar4;
        we weVar5 = new we("UNKNOWN__", 4, "UNKNOWN__");
        w = weVar5;
        we[] weVarArr = {weVar, weVar2, weVar3, weVar4, weVar5};
        x = weVarArr;
        y = v8.l0.t(weVarArr);
        Companion = new ve();
        sy.d0.o("DISMISSED", "EVENT_TYPE", "EVENT_TYPE_RESOURCE", "RESOURCE");
    }

    public we(String str, int i, String str2) {
        this.r = str2;
    }

    public static we valueOf(String str) {
        return (we) Enum.valueOf(we.class, str);
    }

    public static we[] values() {
        return (we[]) x.clone();
    }
}
