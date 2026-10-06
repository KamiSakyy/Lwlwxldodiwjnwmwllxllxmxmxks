package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class nn {
    public static final mn Companion;
    public static final nn s;
    public static final nn t;
    public static final nn u;
    public static final /* synthetic */ nn[] v;
    public static final /* synthetic */ d71.b w;
    public String r;

    static {
        nn nnVar = new nn("CLOSED", 0, "CLOSED");
        s = nnVar;
        nn nnVar2 = new nn("OPEN", 1, "OPEN");
        t = nnVar2;
        nn nnVar3 = new nn("UNKNOWN__", 2, "UNKNOWN__");
        u = nnVar3;
        nn[] nnVarArr = {nnVar, nnVar2, nnVar3};
        v = nnVarArr;
        w = v8.l0.t(nnVarArr);
        Companion = new mn();
        sy.d0.o(new String[]{"CLOSED", "OPEN"});
    }

    public nn(String str, int i, String str2) {
        this.r = str2;
    }

    public static nn valueOf(String str) {
        return (nn) Enum.valueOf(nn.class, str);
    }

    public static nn[] values() {
        return (nn[]) v.clone();
    }
}
