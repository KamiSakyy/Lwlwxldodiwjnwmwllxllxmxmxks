package g2;

import android.view.RenderNode;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class i {
    public static void a(RenderNode renderNode) {
        renderNode.discardDisplayList();
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class RenderNode<T1,T2,T3,T4> {
        public RenderNode() {
        }
    }
}
