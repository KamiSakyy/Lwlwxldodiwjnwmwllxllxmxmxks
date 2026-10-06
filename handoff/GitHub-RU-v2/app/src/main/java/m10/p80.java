package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class p80 {
    public static final o80 Companion;
    public static final aa.a0 s;
    public static final p80 t;
    public static final /* synthetic */ p80[] u;
    public static final /* synthetic */ d71.b v;
    public String r;

    static {
        p80 p80Var = new p80("BLUESKY", 0, "BLUESKY");
        p80 p80Var2 = new p80("FACEBOOK", 1, "FACEBOOK");
        p80 p80Var3 = new p80("GENERIC", 2, "GENERIC");
        p80 p80Var4 = new p80("HOMETOWN", 3, "HOMETOWN");
        p80 p80Var5 = new p80("INSTAGRAM", 4, "INSTAGRAM");
        p80 p80Var6 = new p80("LINKEDIN", 5, "LINKEDIN");
        p80 p80Var7 = new p80("MASTODON", 6, "MASTODON");
        p80 p80Var8 = new p80("NPM", 7, "NPM");
        p80 p80Var9 = new p80("REDDIT", 8, "REDDIT");
        p80 p80Var10 = new p80("TWITCH", 9, "TWITCH");
        p80 p80Var11 = new p80("TWITTER", 10, "TWITTER");
        p80 p80Var12 = new p80("YOUTUBE", 11, "YOUTUBE");
        p80 p80Var13 = new p80("UNKNOWN__", 12, "UNKNOWN__");
        t = p80Var13;
        p80[] p80VarArr = {p80Var, p80Var2, p80Var3, p80Var4, p80Var5, p80Var6, p80Var7, p80Var8, p80Var9, p80Var10, p80Var11, p80Var12, p80Var13};
        u = p80VarArr;
        v = v8.l0.t(p80VarArr);
        Companion = new o80();
        x61.l.r(new String[]{"BLUESKY", "FACEBOOK", "GENERIC", "HOMETOWN", "INSTAGRAM", "LINKEDIN", "MASTODON", "NPM", "REDDIT", "TWITCH", "TWITTER", "YOUTUBE"});
        s = new aa.a0("SocialAccountProvider");
    }

    public p80(String str, int i, String str2) {
        this.r = str2;
    }

    public static p80 valueOf(String str) {
        return (p80) Enum.valueOf(p80.class, str);
    }

    public static p80[] values() {
        return (p80[]) u.clone();
    }
}
