package ba1;

import java.util.function.BiConsumer;

/* loaded from: /home/user/work/p/classes5.dex */
public final /* synthetic */ class d implements BiConsumer {
    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        g gVar = (g) obj;
        CharSequence charSequence = (CharSequence) obj2;
        aa1.b.K(gVar.a);
        if (!gVar.c) {
            gVar.a.append(gVar.b);
        }
        gVar.a.append((Object) charSequence);
        gVar.c = false;
    }
}
