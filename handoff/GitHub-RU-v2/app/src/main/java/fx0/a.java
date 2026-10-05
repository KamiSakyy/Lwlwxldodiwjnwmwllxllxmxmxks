package fx0;

import com.github.service.models.response.feed.FeedDisinterestReason;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FeedDisinterestReason.values().length];
        try {
            iArr[FeedDisinterestReason.DISMISSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FeedDisinterestReason.EVENT_TYPE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FeedDisinterestReason.EVENT_TYPE_RESOURCE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[FeedDisinterestReason.RESOURCE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
