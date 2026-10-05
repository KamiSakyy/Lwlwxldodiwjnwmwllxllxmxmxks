package hz;

import com.github.service.dotcom.models.response.copilot.serialization.ChatMessageFeedbackType$Companion;
import sy.w;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public static final ChatMessageFeedbackType$Companion Companion;
    public static final Object r;
    public static final b s;
    public static final b t;
    public static final /* synthetic */ b[] u;

    static {
        b bVar = new b("NEGATIVE", 0);
        s = bVar;
        b bVar2 = new b("POSITIVE", 1);
        t = bVar2;
        b[] bVarArr = {bVar, bVar2, new b("UNKNOWN", 2)};
        u = bVarArr;
        l0.t(bVarArr);
        Companion = new ChatMessageFeedbackType$Companion();
        r = w.s(w61.i.r, new gz.a(27));
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) u.clone();
    }
}
