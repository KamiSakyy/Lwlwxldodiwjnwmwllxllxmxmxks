package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class sb {
    public static final rb Companion;
    public static final sb s;
    public static final sb t;
    public static final sb u;
    public static final sb v;
    public static final sb w;
    public static final /* synthetic */ sb[] x;
    public static final /* synthetic */ d71.b y;
    public String r;

    static {
        sb sbVar = new sb("DISMISSED", 0, "DISMISSED");
        s = sbVar;
        sb sbVar2 = new sb("EVENT_TYPE", 1, "EVENT_TYPE");
        t = sbVar2;
        sb sbVar3 = new sb("EVENT_TYPE_RESOURCE", 2, "EVENT_TYPE_RESOURCE");
        u = sbVar3;
        sb sbVar4 = new sb("RESOURCE", 3, "RESOURCE");
        v = sbVar4;
        sb sbVar5 = new sb("UNKNOWN__", 4, "UNKNOWN__");
        w = sbVar5;
        sb[] sbVarArr = {sbVar, sbVar2, sbVar3, sbVar4, sbVar5};
        x = sbVarArr;
        y = v8.l0.t(sbVarArr);
        Companion = new rb();
        sy.d0Shadow.o(new String[]{"DISMISSED", "EVENT_TYPE", "EVENT_TYPE_RESOURCE", "RESOURCE"});
    }

    public sb(String str, int i, String str2) {
        this.r = str2;
    }

    public static sb valueOf(String str) {
        return (sb) Enum.valueOf(sb.class, str);
    }

    public static sb[] values() {
        return (sb[]) x.clone();
    }
}
