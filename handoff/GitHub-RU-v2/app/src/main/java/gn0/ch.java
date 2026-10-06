package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class ch {
    public static final bh Companion;
    public static final ch r;
    public static final /* synthetic */ ch[] s;

    static {
        ch chVar = new ch("PHONE", 0, "PHONE");
        r = chVar;
        ch[] chVarArr = {chVar, new ch("TABLET", 1, "TABLET"), new ch("UNKNOWN__", 2, "UNKNOWN__")};
        s = chVarArr;
        v8.l0.t(chVarArr);
        Companion = new bh();
        sy.d0Shadow.o(new String[]{"PHONE", "TABLET"});
    }

    public ch(String str, int i, String str2) {
    }

    public static ch valueOf(String str) {
        return (ch) Enum.valueOf(ch.class, str);
    }

    public static ch[] values() {
        return (ch[]) s.clone();
    }
}
