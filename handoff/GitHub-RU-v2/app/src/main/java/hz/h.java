package hz;

import com.github.service.dotcom.models.response.copilot.serialization.ChatMessageRoleResponse$Companion;
import sy.w;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public static final ChatMessageRoleResponse$Companion Companion;
    public static final Object r;
    public static final h s;
    public static final h t;
    public static final /* synthetic */ h[] u;

    static {
        h hVar = new h("ASSISTANT", 0);
        s = hVar;
        h hVar2 = new h("USER", 1);
        t = hVar2;
        h[] hVarArr = {hVar, hVar2};
        u = hVarArr;
        l0.t(hVarArr);
        Companion = new ChatMessageRoleResponse$Companion();
        r = w.s(w61.i.r, new e(14));
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) u.clone();
    }
}
