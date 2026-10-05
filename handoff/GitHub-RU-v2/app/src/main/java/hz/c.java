package hz;

import com.github.service.dotcom.models.response.copilot.serialization.ChatMessageNegativeFeedbackChoiceType$Companion;
import sy.w;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public static final ChatMessageNegativeFeedbackChoiceType$Companion Companion;
    public static final Object r;
    public static final c s;
    public static final c t;
    public static final c u;
    public static final c v;
    public static final c w;
    public static final /* synthetic */ c[] x;

    static {
        c cVar = new c("OFFENSIVE_OR_DISCRIMINATORY", 0);
        s = cVar;
        c cVar2 = new c("POORLY_FORMATTED", 1);
        t = cVar2;
        c cVar3 = new c("NOT_TRUE", 2);
        u = cVar3;
        c cVar4 = new c("UNHELPFUL", 3);
        v = cVar4;
        c cVar5 = new c("UNKNOWN", 4);
        w = cVar5;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5};
        x = cVarArr;
        l0.t(cVarArr);
        Companion = new ChatMessageNegativeFeedbackChoiceType$Companion();
        r = w.s(w61.i.r, new gz.a(28));
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) x.clone();
    }
}
