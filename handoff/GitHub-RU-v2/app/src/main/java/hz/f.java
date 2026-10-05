package hz;

import com.github.service.dotcom.models.response.copilot.serialization.ChatMessageReferenceTypeResponse$Companion;
import sy.w;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class f {
    public static final ChatMessageReferenceTypeResponse$Companion Companion;
    public static final Object r;
    public static final f s;
    public static final f t;
    public static final f u;
    public static final f v;
    public static final /* synthetic */ f[] w;

    static {
        f fVar = new f("REPOSITORY", 0);
        s = fVar;
        f fVar2 = new f("FILE", 1);
        t = fVar2;
        f fVar3 = new f("WEB_SEARCH", 2);
        u = fVar3;
        f fVar4 = new f("SNIPPET", 3);
        f fVar5 = new f("AGENT", 4);
        f fVar6 = new f("UNKNOWN", 5);
        v = fVar6;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5, fVar6};
        w = fVarArr;
        l0.t(fVarArr);
        Companion = new ChatMessageReferenceTypeResponse$Companion();
        r = w.s(w61.i.r, new e(7));
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) w.clone();
    }
}
