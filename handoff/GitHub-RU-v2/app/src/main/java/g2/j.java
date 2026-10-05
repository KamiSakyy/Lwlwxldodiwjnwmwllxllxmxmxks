package g2;

import android.view.RenderNode;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class j {
    public static int a(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    public static int b(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    public static void c(RenderNode renderNode, int i) {
        renderNode.setAmbientShadowColor(i);
    }

    public static void d(RenderNode renderNode, int i) {
        renderNode.setSpotShadowColor(i);
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class RenderNode<T1,T2,T3,T4> {
        public RenderNode() {
        }
    }
}
