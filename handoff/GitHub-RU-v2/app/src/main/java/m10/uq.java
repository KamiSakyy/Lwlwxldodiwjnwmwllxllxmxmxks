package m10;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes3.dex */
public final class uq {
    public static final tq Companion;
    public static final aa.a0 s;
    public static final uq t;
    public static final /* synthetic */ uq[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        uq uqVar = new uq("LIST_IGNORED", 0, "LIST_IGNORED");
        uq uqVar2 = new uq("LIST_SUBSCRIBED", 1, "LIST_SUBSCRIBED");
        uq uqVar3 = new uq("THREAD_SUBSCRIBED", 2, "THREAD_SUBSCRIBED");
        uq uqVar4 = new uq("THREAD_TYPE_SUBSCRIBED", 3, "THREAD_TYPE_SUBSCRIBED");
        uq uqVar5 = new uq("UNSUBSCRIBED", 4, "UNSUBSCRIBED");
        uq uqVar6 = new uq("UNKNOWN__", 5, "UNKNOWN__");
        t = uqVar6;
        uq[] uqVarArr = {uqVar, uqVar2, uqVar3, uqVar4, uqVar5, uqVar6};
        u = uqVarArr;
        v = v8.l0.t(uqVarArr);
        Companion = new tq();
        x61.l.r(new String[]{"LIST_IGNORED", "LIST_SUBSCRIBED", "THREAD_SUBSCRIBED", "THREAD_TYPE_SUBSCRIBED", "UNSUBSCRIBED"});
        s = new aa.a0("NotificationThreadSubscriptionState");
    }

    public uq(String str, int i, String str2) {
        this.r = str2;
    }

    public static uq valueOf(String str) {
        return (uq) Enum.valueOf(uq.class, str);
    }

    public static uq[] values() {
        return (uq[]) u.clone();
    }
}
