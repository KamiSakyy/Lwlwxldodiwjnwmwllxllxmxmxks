package hz;

import com.github.service.dotcom.models.response.copilot.serialization.ChatServerSentEventErrorTypeResponse$Companion;
import sy.w;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class j {
    public static final ChatServerSentEventErrorTypeResponse$Companion Companion;
    public static final Object r;
    public static final j s;
    public static final /* synthetic */ j[] t;

    static {
        j jVar = new j("EXCEPTION", 0);
        s = jVar;
        j[] jVarArr = {jVar, new j("RATE_LIMIT", 1), new j("UNKNOWN", 2)};
        t = jVarArr;
        l0.t(jVarArr);
        Companion = new ChatServerSentEventErrorTypeResponse$Companion();
        r = w.s(w61.i.r, new e(29));
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) t.clone();
    }
}
