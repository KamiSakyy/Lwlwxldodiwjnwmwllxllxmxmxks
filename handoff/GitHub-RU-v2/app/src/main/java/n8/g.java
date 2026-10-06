package n8;

import a0.s0;
import androidx.window.core.WindowStrictModeException;
import java.util.ArrayList;
import k71.k;
import kotlin.NoWhenBranchMatchedException;
import sy.d0;
import x61.l;
import x61.r;

/* loaded from: /home/user/work/p/classes.dex */
public final class g extends k21.f {

    /* renamed from: c, reason: collision with root package name */
    public Object f29658c;

    /* renamed from: d, reason: collision with root package name */
    public String f29659d;

    /* renamed from: e, reason: collision with root package name */
    public i f29660e;

    /* renamed from: f, reason: collision with root package name */
    public WindowStrictModeException f29661f;

    public g(Object obj, String str, a aVar, i iVar) {
        r rVar;
        k.g(obj, "value");
        k.g(iVar, "verificationMode");
        this.f29658c = obj;
        this.f29659d = str;
        this.f29660e = iVar;
        String l = k21.f.l(obj, str);
        k.g(l, "message");
        WindowStrictModeException windowStrictModeException = new WindowStrictModeException(l);
        StackTraceElement[] stackTrace = windowStrictModeException.getStackTrace();
        k.f(stackTrace, "getStackTrace(...)");
        int length = stackTrace.length - 2;
        length = length < 0 ? 0 : length;
        if (length < 0) {
            throw new IllegalArgumentException(s0.i("Requested element count ", length, " is less than zero.").toString());
        }
        if (length == 0) {
            rVar = r.r;
        } else {
            int length2 = stackTrace.length;
            if (length >= length2) {
                rVar = l.g0(stackTrace);
            } else if (length == 1) {
                rVar = d0.n(stackTrace[length2 - 1]);
            } else {
                r arrayList = new ArrayList(length);
                for (int i = length2 - length; i < length2; i++) {
                    arrayList.add(stackTrace[i]);
                }
                rVar = arrayList;
            }
        }
        windowStrictModeException.setStackTrace((StackTraceElement[]) rVar.toArray(new StackTraceElement[0]));
        this.f29661f = windowStrictModeException;
    }

    public final k21.f B(j71.c cVar, String str) {
        return this;
    }

    public final Object k() {
        int ordinal = this.f29660e.ordinal();
        if (ordinal == 0) {
            throw this.f29661f;
        }
        if (ordinal == 1) {
            k.g(k21.f.l(this.f29658c, this.f29659d), "message");
            return null;
        }
        if (ordinal == 2) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
