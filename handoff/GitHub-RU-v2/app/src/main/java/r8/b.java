package r8;

import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.extensions.MulticastConsumer;
import k71.i;
import k71.k;
import w61.a0;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class b extends i implements j71.c {
    public final Object k(Object obj) {
        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
        k.g(windowLayoutInfo, "p0");
        ((MulticastConsumer) ((k71.c) this).s).accept(windowLayoutInfo);
        return a0.a;
    }
}
