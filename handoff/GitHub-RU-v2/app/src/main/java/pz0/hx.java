package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class hx {
    public static final gx Companion;
    public static final hx s;
    public static final hx t;
    public static final hx u;
    public static final hx v;
    public static final hx w;
    public static final /* synthetic */ hx[] x;
    public static final /* synthetic */ d71.b y;
    public String r;

    static {
        hx hxVar = new hx("DUPLICATE", 0, "DUPLICATE");
        s = hxVar;
        hx hxVar2 = new hx("OFF_TOPIC", 1, "OFF_TOPIC");
        t = hxVar2;
        hx hxVar3 = new hx("OUTDATED", 2, "OUTDATED");
        u = hxVar3;
        hx hxVar4 = new hx("RESOLVED", 3, "RESOLVED");
        v = hxVar4;
        hx hxVar5 = new hx("UNKNOWN__", 4, "UNKNOWN__");
        w = hxVar5;
        hx[] hxVarArr = {hxVar, hxVar2, hxVar3, hxVar4, hxVar5};
        x = hxVarArr;
        y = v8.l0.t(hxVarArr);
        Companion = new gx();
        sy.d0Shadow.o(new String[]{"DUPLICATE", "OFF_TOPIC", "OUTDATED", "RESOLVED"});
    }

    public hx(String str, int i, String str2) {
        this.r = str2;
    }

    public static hx valueOf(String str) {
        return (hx) Enum.valueOf(hx.class, str);
    }

    public static hx[] values() {
        return (hx[]) x.clone();
    }
}
