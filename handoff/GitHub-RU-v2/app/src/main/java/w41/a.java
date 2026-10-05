package w41;

import java.util.concurrent.atomic.AtomicBoolean;
import w21.g;
import w21.o;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final i7.c a = new i7.c(0);

    public static o a(o oVar, o oVar2) {
        s21.a aVar = new s21.a(19);
        g gVar = new g((s21.a) aVar.s);
        r11.b bVar = new r11.b(gVar, new AtomicBoolean(false), aVar, 6);
        i7.c cVar = a;
        oVar.f(cVar, bVar);
        oVar2.f(cVar, bVar);
        return gVar.a;
    }
}
