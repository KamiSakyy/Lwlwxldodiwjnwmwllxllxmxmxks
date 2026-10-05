package hz;

import com.github.service.dotcom.models.response.copilot.serialization.ChatServerSentEventFunctionCallType$Companion;
import sy.w;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class m {
    public static final ChatServerSentEventFunctionCallType$Companion Companion;
    public static final Object r;
    public static final m s;
    public static final /* synthetic */ m[] t;

    static {
        m mVar = new m("BING_SEARCH", 0);
        m mVar2 = new m("CODE_SEARCH", 1);
        m mVar3 = new m("UNKNOWN", 2);
        s = mVar3;
        m[] mVarArr = {mVar, mVar2, mVar3};
        t = mVarArr;
        l0.t(mVarArr);
        Companion = new ChatServerSentEventFunctionCallType$Companion();
        r = w.s(w61.i.r, new k(1));
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) t.clone();
    }
}
