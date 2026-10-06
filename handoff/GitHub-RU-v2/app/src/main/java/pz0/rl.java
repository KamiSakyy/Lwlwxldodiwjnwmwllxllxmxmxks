package pz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class rl {
    public static final ql Companion;
    public static final aa.a0 s;
    public static final rl t;
    public static final /* synthetic */ rl[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        rl rlVar = new rl("LIST_IGNORED", 0, "LIST_IGNORED");
        rl rlVar2 = new rl("LIST_SUBSCRIBED", 1, "LIST_SUBSCRIBED");
        rl rlVar3 = new rl("THREAD_SUBSCRIBED", 2, "THREAD_SUBSCRIBED");
        rl rlVar4 = new rl("THREAD_TYPE_SUBSCRIBED", 3, "THREAD_TYPE_SUBSCRIBED");
        rl rlVar5 = new rl("UNSUBSCRIBED", 4, "UNSUBSCRIBED");
        rl rlVar6 = new rl("UNKNOWN__", 5, "UNKNOWN__");
        t = rlVar6;
        rl[] rlVarArr = {rlVar, rlVar2, rlVar3, rlVar4, rlVar5, rlVar6};
        u = rlVarArr;
        v = v8.l0.t(rlVarArr);
        Companion = new ql();
        x61.l.r(new String[]{"LIST_IGNORED", "LIST_SUBSCRIBED", "THREAD_SUBSCRIBED", "THREAD_TYPE_SUBSCRIBED", "UNSUBSCRIBED"});
        s = new aa.a0("NotificationThreadSubscriptionState");
    }

    public rl(String str, int i, String str2) {
        this.r = str2;
    }

    public static rl valueOf(String str) {
        return (rl) Enum.valueOf(rl.class, str);
    }

    public static rl[] values() {
        return (rl[]) u.clone();
    }
}
