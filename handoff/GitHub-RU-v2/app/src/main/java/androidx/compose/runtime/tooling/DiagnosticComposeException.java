package androidx.compose.runtime.tooling;

import com.google.android.gms.internal.measurement.z3;
import java.util.ArrayList;
import java.util.List;
import k71.k;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes.dex */
public final class DiagnosticComposeException extends RuntimeException {

    /* renamed from: r, reason: collision with root package name */
    public a f1845r;

    public DiagnosticComposeException(a aVar) {
        this.f1845r = aVar;
        if (aVar.a()) {
            return;
        }
        ArrayList o5 = z3.o(aVar);
        int size = o5.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size];
        for (int i = 0; i < size; i++) {
            stackTraceElementArr[i] = new StackTraceElement("$$compose", "m$" + ((b) o5.get(i)).f1847a, "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        a aVar = this.f1845r;
        if (!aVar.a()) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb2 = new StringBuilder("Composition stack when thrown:\n");
        int i = 0;
        if (aVar.a()) {
            y61.b i10 = d0Shadow.i();
            List list = aVar.f1846a;
            k.g(list, "<this>");
            t71.k kVar = new t71.k(list);
            int a10 = kVar.a();
            for (int i11 = 0; i11 < a10; i11++) {
                ((b) kVar.get(i11)).getClass();
            }
            y61.b h10 = d0Shadow.h(i10);
            k.g(h10, "<this>");
            t71.k kVar2 = new t71.k((List) h10);
            int a11 = kVar2.a();
            while (i < a11) {
                String str = (String) kVar2.get(i);
                sb2.append("\tat ");
                sb2.append(str);
                sb2.append('\n');
                i++;
            }
        } else {
            ArrayList o5 = z3.o(aVar);
            int size = o5.size();
            while (i < size) {
                b bVar = (b) o5.get(i);
                sb2.append("\tat $$compose.m$");
                sb2.append(bVar.f1847a);
                sb2.append("(SourceFile:1)\n");
                i++;
            }
        }
        String sb3 = sb2.toString();
        k.f(sb3, "toString(...)");
        return sb3;
    }
}
