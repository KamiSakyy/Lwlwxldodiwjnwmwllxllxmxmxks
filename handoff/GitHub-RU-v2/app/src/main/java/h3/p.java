package h3;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import kotlin.KotlinNothingValueException;

/* loaded from: /home/user/work/p/classes.dex */
public final class p extends Canvas {

    /* renamed from: a, reason: collision with root package name */
    public Canvas f25471a;

    public final Canvas a() {
        Canvas canvas = this.f25471a;
        if (canvas != null) {
            return canvas;
        }
        m3.a.d("Text drawing wrapper is missing a Canvas!");
        throw new KotlinNothingValueException();
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutPath(Path path) {
        return a().clipOutPath(path);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(RectF rectF) {
        return a().clipOutRect(rectF);
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path, Region.Op op) {
        return a().clipPath(path, op);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF, Region.Op op) {
        return a().clipRect(rectF, op);
    }

    @Override // android.graphics.Canvas
    public final void concat(Matrix matrix) {
        a().concat(matrix);
    }

    @Override // android.graphics.Canvas
    public final void disableZ() {
        e.a(a());
    }

    @Override // android.graphics.Canvas
    public final void drawARGB(int i, int i10, int i11, int i12) {
        a().drawARGB(i, i10, i11, i12);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(RectF rectF, float f6, float f10, boolean z10, Paint paint) {
        a().drawArc(rectF, f6, f10, z10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, float f6, float f10, Paint paint) {
        a().drawBitmap(bitmap, f6, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmapMesh(Bitmap bitmap, int i, int i10, float[] fArr, int i11, int[] iArr, int i12, Paint paint) {
        a().drawBitmapMesh(bitmap, i, i10, fArr, i11, iArr, i12, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawCircle(float f6, float f10, float f11, Paint paint) {
        a().drawCircle(f6, f10, f11, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i) {
        a().drawColor(i);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float f6, float f10, RectF rectF2, float f11, float f12, Paint paint) {
        e.e(a(), rectF, f6, f10, rectF2, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawGlyphs(int[] iArr, int i, float[] fArr, int i10, int i11, Font font, Paint paint) {
        g.a(a(), iArr, i, fArr, i10, i11, font, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawLine(float f6, float f10, float f11, float f12, Paint paint) {
        a().drawLine(f6, f10, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, int i, int i10, Paint paint) {
        a().drawLines(fArr, i, i10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(RectF rectF, Paint paint) {
        a().drawOval(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPaint(Paint paint) {
        a().drawPaint(paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, Rect rect, Paint paint) {
        g.b(a(), ninePatch, rect, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPath(Path path, Paint paint) {
        a().drawPath(path, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture) {
        a().drawPicture(picture);
    }

    @Override // android.graphics.Canvas
    public final void drawPoint(float f6, float f10, Paint paint) {
        a().drawPoint(f6, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, int i, int i10, Paint paint) {
        a().drawPoints(fArr, i, i10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(char[] cArr, int i, int i10, float[] fArr, Paint paint) {
        a().drawPosText(cArr, i, i10, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRGB(int i, int i10, int i11) {
        a().drawRGB(i, i10, i11);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(RectF rectF, Paint paint) {
        a().drawRect(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRenderNode(RenderNode renderNode) {
        e.g(a(), renderNode);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(RectF rectF, float f6, float f10, Paint paint) {
        a().drawRoundRect(rectF, f6, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(char[] cArr, int i, int i10, float f6, float f10, Paint paint) {
        a().drawText(cArr, i, i10, f6, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(char[] cArr, int i, int i10, Path path, float f6, float f10, Paint paint) {
        a().drawTextOnPath(cArr, i, i10, path, f6, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(char[] cArr, int i, int i10, int i11, int i12, float f6, float f10, boolean z10, Paint paint) {
        a().drawTextRun(cArr, i, i10, i11, i12, f6, f10, z10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawVertices(Canvas.VertexMode vertexMode, int i, float[] fArr, int i10, float[] fArr2, int i11, int[] iArr, int i12, short[] sArr, int i13, int i14, Paint paint) {
        a().drawVertices(vertexMode, i, fArr, i10, fArr2, i11, iArr, i12, sArr, i13, i14, paint);
    }

    @Override // android.graphics.Canvas
    public final void enableZ() {
        e.i(a());
    }

    @Override // android.graphics.Canvas
    public final boolean getClipBounds(Rect rect) {
        boolean clipBounds = a().getClipBounds(rect);
        if (clipBounds) {
            rect.set(0, 0, rect.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public final int getDensity() {
        return a().getDensity();
    }

    @Override // android.graphics.Canvas
    public final DrawFilter getDrawFilter() {
        return a().getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public final int getHeight() {
        return a().getHeight();
    }

    @Override // android.graphics.Canvas
    public final void getMatrix(Matrix matrix) {
        a().getMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapHeight() {
        return a().getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public final int getMaximumBitmapWidth() {
        return a().getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public final int getSaveCount() {
        return a().getSaveCount();
    }

    @Override // android.graphics.Canvas
    public final int getWidth() {
        return a().getWidth();
    }

    @Override // android.graphics.Canvas
    public final boolean isOpaque() {
        return a().isOpaque();
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF, Canvas.EdgeType edgeType) {
        return a().quickReject(rectF, edgeType);
    }

    @Override // android.graphics.Canvas
    public final void restore() {
        a().restore();
    }

    @Override // android.graphics.Canvas
    public final void restoreToCount(int i) {
        a().restoreToCount(i);
    }

    @Override // android.graphics.Canvas
    public final void rotate(float f6) {
        a().rotate(f6);
    }

    @Override // android.graphics.Canvas
    public final int save() {
        return a().save();
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint, int i) {
        return a().saveLayer(rectF, paint, i);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i, int i10) {
        return a().saveLayerAlpha(rectF, i, i10);
    }

    @Override // android.graphics.Canvas
    public final void scale(float f6, float f10) {
        a().scale(f6, f10);
    }

    @Override // android.graphics.Canvas
    public final void setBitmap(Bitmap bitmap) {
        a().setBitmap(bitmap);
    }

    @Override // android.graphics.Canvas
    public final void setDensity(int i) {
        a().setDensity(i);
    }

    @Override // android.graphics.Canvas
    public final void setDrawFilter(DrawFilter drawFilter) {
        a().setDrawFilter(drawFilter);
    }

    @Override // android.graphics.Canvas
    public final void setMatrix(Matrix matrix) {
        a().setMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public final void skew(float f6, float f10) {
        a().skew(f6, f10);
    }

    @Override // android.graphics.Canvas
    public final void translate(float f6, float f10) {
        a().translate(f6, f10);
    }

    @Override // android.graphics.Canvas
    public final boolean clipPath(Path path) {
        return a().clipPath(path);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect, Region.Op op) {
        return a().clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public final void drawArc(float f6, float f10, float f11, float f12, float f13, float f14, boolean z10, Paint paint) {
        a().drawArc(f6, f10, f11, f12, f13, f14, z10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        a().drawBitmap(bitmap, rect, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j10) {
        e.c(a(), j10);
    }

    @Override // android.graphics.Canvas
    public final void drawLines(float[] fArr, Paint paint) {
        a().drawLines(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawOval(float f6, float f10, float f11, float f12, Paint paint) {
        a().drawOval(f6, f10, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPatch(NinePatch ninePatch, RectF rectF, Paint paint) {
        g.c(a(), ninePatch, rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, RectF rectF) {
        a().drawPicture(picture, rectF);
    }

    @Override // android.graphics.Canvas
    public final void drawPoints(float[] fArr, Paint paint) {
        a().drawPoints(fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPosText(String str, float[] fArr, Paint paint) {
        a().drawPosText(str, fArr, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(Rect rect, Paint paint) {
        a().drawRect(rect, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawRoundRect(float f6, float f10, float f11, float f12, float f13, float f14, Paint paint) {
        a().drawRoundRect(f6, f10, f11, f12, f13, f14, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, float f6, float f10, Paint paint) {
        a().drawText(str, f6, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextOnPath(String str, Path path, float f6, float f10, Paint paint) {
        a().drawTextOnPath(str, path, f6, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(RectF rectF) {
        return f.c(a(), rectF);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(RectF rectF, Paint paint) {
        return a().saveLayer(rectF, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(RectF rectF, int i) {
        return a().saveLayerAlpha(rectF, i);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(Rect rect) {
        return a().clipOutRect(rect);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(RectF rectF) {
        return a().clipRect(rectF);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        a().drawBitmap(bitmap, rect, rect2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i, PorterDuff.Mode mode) {
        a().drawColor(i, mode);
    }

    @Override // android.graphics.Canvas
    public final void drawDoubleRoundRect(RectF rectF, float[] fArr, RectF rectF2, float[] fArr2, Paint paint) {
        e.f(a(), rectF, fArr, rectF2, fArr2, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawPicture(Picture picture, Rect rect) {
        a().drawPicture(picture, rect);
    }

    @Override // android.graphics.Canvas
    public final void drawRect(float f6, float f10, float f11, float f12, Paint paint) {
        a().drawRect(f6, f10, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawText(String str, int i, int i10, float f6, float f10, Paint paint) {
        a().drawText(str, i, i10, f6, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(CharSequence charSequence, int i, int i10, int i11, int i12, float f6, float f10, boolean z10, Paint paint) {
        a().drawTextRun(charSequence, i, i10, i11, i12, f6, f10, z10, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path, Canvas.EdgeType edgeType) {
        return a().quickReject(path, edgeType);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f6, float f10, float f11, float f12, Paint paint, int i) {
        return a().saveLayer(f6, f10, f11, f12, paint, i);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f6, float f10, float f11, float f12, int i, int i10) {
        return a().saveLayerAlpha(f6, f10, f11, f12, i, i10);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(Rect rect) {
        return a().clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i, int i10, float f6, float f10, int i11, int i12, boolean z10, Paint paint) {
        a().drawBitmap(iArr, i, i10, f6, f10, i11, i12, z10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(int i, BlendMode blendMode) {
        e.b(a(), i, blendMode);
    }

    @Override // android.graphics.Canvas
    public final void drawText(CharSequence charSequence, int i, int i10, float f6, float f10, Paint paint) {
        a().drawText(charSequence, i, i10, f6, f10, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(Path path) {
        return f.b(a(), path);
    }

    @Override // android.graphics.Canvas
    public final int saveLayer(float f6, float f10, float f11, float f12, Paint paint) {
        return a().saveLayer(f6, f10, f11, f12, paint);
    }

    @Override // android.graphics.Canvas
    public final int saveLayerAlpha(float f6, float f10, float f11, float f12, int i) {
        return a().saveLayerAlpha(f6, f10, f11, f12, i);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(float f6, float f10, float f11, float f12) {
        return a().clipOutRect(f6, f10, f11, f12);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f6, float f10, float f11, float f12, Region.Op op) {
        return a().clipRect(f6, f10, f11, f12, op);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(int[] iArr, int i, int i10, int i11, int i12, int i13, int i14, boolean z10, Paint paint) {
        a().drawBitmap(iArr, i, i10, i11, i12, i13, i14, z10, paint);
    }

    @Override // android.graphics.Canvas
    public final void drawColor(long j10, BlendMode blendMode) {
        e.d(a(), j10, blendMode);
    }

    @Override // android.graphics.Canvas
    public final void drawTextRun(MeasuredText measuredText, int i, int i10, int i11, int i12, float f6, float f10, boolean z10, Paint paint) {
        e.h(a(), measuredText, i, i10, i11, i12, f6, f10, z10, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f6, float f10, float f11, float f12, Canvas.EdgeType edgeType) {
        return a().quickReject(f6, f10, f11, f12, edgeType);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(float f6, float f10, float f11, float f12) {
        return a().clipRect(f6, f10, f11, f12);
    }

    @Override // android.graphics.Canvas
    public final void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        a().drawBitmap(bitmap, matrix, paint);
    }

    @Override // android.graphics.Canvas
    public final boolean quickReject(float f6, float f10, float f11, float f12) {
        return f.a(a(), f6, f10, f11, f12);
    }

    @Override // android.graphics.Canvas
    public final boolean clipOutRect(int i, int i10, int i11, int i12) {
        return a().clipOutRect(i, i10, i11, i12);
    }

    @Override // android.graphics.Canvas
    public final boolean clipRect(int i, int i10, int i11, int i12) {
        return a().clipRect(i, i10, i11, i12);
    }
}
