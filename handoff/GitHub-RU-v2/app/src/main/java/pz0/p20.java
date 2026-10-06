package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class p20 {
    public static final o20 Companion;
    public static final aa.a0 s;
    public static final p20 t;
    public static final /* synthetic */ p20[] u;
    public static final /* synthetic */ d71.b v;
    public String r;

    static {
        p20 p20Var = new p20("BLUESKY", 0, "BLUESKY");
        p20 p20Var2 = new p20("FACEBOOK", 1, "FACEBOOK");
        p20 p20Var3 = new p20("GENERIC", 2, "GENERIC");
        p20 p20Var4 = new p20("HOMETOWN", 3, "HOMETOWN");
        p20 p20Var5 = new p20("INSTAGRAM", 4, "INSTAGRAM");
        p20 p20Var6 = new p20("LINKEDIN", 5, "LINKEDIN");
        p20 p20Var7 = new p20("MASTODON", 6, "MASTODON");
        p20 p20Var8 = new p20("NPM", 7, "NPM");
        p20 p20Var9 = new p20("REDDIT", 8, "REDDIT");
        p20 p20Var10 = new p20("TWITCH", 9, "TWITCH");
        p20 p20Var11 = new p20("TWITTER", 10, "TWITTER");
        p20 p20Var12 = new p20("YOUTUBE", 11, "YOUTUBE");
        p20 p20Var13 = new p20("UNKNOWN__", 12, "UNKNOWN__");
        t = p20Var13;
        p20[] p20VarArr = {p20Var, p20Var2, p20Var3, p20Var4, p20Var5, p20Var6, p20Var7, p20Var8, p20Var9, p20Var10, p20Var11, p20Var12, p20Var13};
        u = p20VarArr;
        v = v8.l0.t(p20VarArr);
        Companion = new o20();
        x61.l.r(new String[]{"BLUESKY", "FACEBOOK", "GENERIC", "HOMETOWN", "INSTAGRAM", "LINKEDIN", "MASTODON", "NPM", "REDDIT", "TWITCH", "TWITTER", "YOUTUBE"});
        s = new aa.a0("SocialAccountProvider");
    }

    public p20(String str, int i, String str2) {
        this.r = str2;
    }

    public static p20 valueOf(String str) {
        return (p20) Enum.valueOf(p20.class, str);
    }

    public static p20[] values() {
        return (p20[]) u.clone();
    }
}
