package gn0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes4.dex */
public final class ti {
    public static final si Companion;
    public static final aa.a0 s;
    public static final ti t;
    public static final /* synthetic */ ti[] u;
    public static final /* synthetic */ d71.b v;
    public final String r;

    static {
        ti tiVar = new ti("LIST_IGNORED", 0, "LIST_IGNORED");
        ti tiVar2 = new ti("LIST_SUBSCRIBED", 1, "LIST_SUBSCRIBED");
        ti tiVar3 = new ti("THREAD_SUBSCRIBED", 2, "THREAD_SUBSCRIBED");
        ti tiVar4 = new ti("THREAD_TYPE_SUBSCRIBED", 3, "THREAD_TYPE_SUBSCRIBED");
        ti tiVar5 = new ti("UNSUBSCRIBED", 4, "UNSUBSCRIBED");
        ti tiVar6 = new ti("UNKNOWN__", 5, "UNKNOWN__");
        t = tiVar6;
        ti[] tiVarArr = {tiVar, tiVar2, tiVar3, tiVar4, tiVar5, tiVar6};
        u = tiVarArr;
        v = v8.l0.t(tiVarArr);
        Companion = new si();
        x61.l.r(new String[]{"LIST_IGNORED", "LIST_SUBSCRIBED", "THREAD_SUBSCRIBED", "THREAD_TYPE_SUBSCRIBED", "UNSUBSCRIBED"});
        s = new aa.a0("NotificationThreadSubscriptionState");
    }

    public ti(String str, int i, String str2) {
        this.r = str2;
    }

    public static ti valueOf(String str) {
        return (ti) Enum.valueOf(ti.class, str);
    }

    public static ti[] values() {
        return (ti[]) u.clone();
    }
}
