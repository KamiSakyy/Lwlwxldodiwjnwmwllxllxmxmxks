package g31;

import com.google.android.material.carousel.CarouselLayoutManager;
import l7.w0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c {
    public int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ CarouselLayoutManager c;

    public c(int i) {
        this.a = i;
    }

    public final int a() {
        switch (this.b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.c;
                if (carouselLayoutManager.K0()) {
                    return ((w0) carouselLayoutManager).n;
                }
                return 0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(CarouselLayoutManager carouselLayoutManager, int i) {
        this(1);
        this.b = i;
        switch (i) {
            case 1:
                this.c = carouselLayoutManager;
                this(0);
                break;
            default:
                this.c = carouselLayoutManager;
                break;
        }
    }
}
