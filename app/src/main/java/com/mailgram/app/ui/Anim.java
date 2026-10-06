package com.mailgram.app.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.HapticFeedbackConstants;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.view.animation.PathInterpolator;

import com.mailgram.app.store.Prefs;

/**
 * Пружинные анимации в духе Material 3 Expressive и iOS 26 (Liquid Glass motion):
 * <ul>
 *   <li><b>spatial</b> — перемещение/масштаб с лёгким перелётом (damping 0.6–0.75);</li>
 *   <li><b>effects</b> — прозрачность и цвет без перелёта;</li>
 *   <li>быстрые «микро-отклики» на касание, как «физическая» реакция компонентов.</li>
 * </ul>
 * Все длительности короткие (120–320 мс), анимации отключаются настройкой «Анимации сообщений»
 * и системным «уменьшить движение» (ANIMATOR_DURATION_SCALE = 0).
 */
public final class Anim {

    public static final PathInterpolator EMPHASIZED =
            new PathInterpolator(0.2f, 0f, 0f, 1f);
    private static final OvershootInterpolator BOUNCE = new OvershootInterpolator(1.15f);

    private Anim() {
    }

    public static boolean enabled(Context ctx) {
        if (!Prefs.animations(ctx)) return false;
        try {
            return ValueAnimator.areAnimatorsEnabled();
        } catch (Throwable t) {
            return true;
        }
    }

    // ---------------- появление элементов ----------------

    /** Появление сообщения: масштаб + подъём с пружиной. */
    public static void springIn(View view, float fromScale, float fromTranslationDp) {
        Context ctx = view.getContext();
        if (!enabled(ctx)) {
            view.setAlpha(1f);
            view.setScaleX(1f);
            view.setScaleY(1f);
            view.setTranslationY(0f);
            return;
        }
        view.setAlpha(0f);
        view.setScaleX(fromScale);
        view.setScaleY(fromScale);
        view.setTranslationY(Ui.dp(ctx, fromTranslationDp));
        view.animate()
                .alpha(1f)
                .scaleX(1f)
                .scaleY(1f)
                .translationY(0f)
                .setInterpolator(BOUNCE)
                .setDuration(260L)
                .start();
    }

    /** Поочерёдное появление дочерних блоков контейнера — «каскад» секций. */
    public static void cascade(final ViewGroup group, final long stepMs, final float fromY) {
        if (group == null) return;
        boolean on = enabled(group.getContext());
        for (int i = 0; i < group.getChildCount(); i++) {
            final View child = group.getChildAt(i);
            if (!on) {
                child.setAlpha(1f);
                child.setTranslationY(0f);
                continue;
            }
            child.setAlpha(0f);
            child.setTranslationY(Ui.dp(group.getContext(), fromY));
            child.animate().alpha(1f).translationY(0f)
                    .setStartDelay(Math.min(i, 8) * stepMs)
                    .setInterpolator(EMPHASIZED)
                    .setDuration(320L)
                    .start();
        }
    }

    /** Появление элемента списка с задержкой по индексу (эффект «волны»). */
    public static void staggeredIn(View view, int index) {
        if (!enabled(view.getContext())) {
            view.setAlpha(1f);
            view.setTranslationY(0f);
            return;
        }
        int delay = Math.min(index, 8) * 24;
        view.setAlpha(0f);
        view.setTranslationY(Ui.dp(view.getContext(), 14));
        view.animate()
                .alpha(1f)
                .translationY(0f)
                .setStartDelay(delay)
                .setInterpolator(EMPHASIZED)
                .setDuration(240L)
                .start();
    }

    /** Быстрый «поп» — реакции, чипсы, кнопки. */
    public static void pop(View view) {
        if (!enabled(view.getContext())) return;
        view.setScaleX(0.6f);
        view.setScaleY(0.6f);
        view.animate().scaleX(1f).scaleY(1f)
                .setInterpolator(BOUNCE).setDuration(240L).start();
    }

    /** Мягкое проявление (цвет/прозрачность — без перелёта). */
    public static void fadeIn(View view, long duration) {
        if (!enabled(view.getContext())) {
            view.setAlpha(1f);
            return;
        }
        view.setAlpha(0f);
        view.animate().alpha(1f).setInterpolator(EMPHASIZED).setDuration(duration).start();
    }

    /** Мягкое проявление со задержкой — для «каскада» панелей. */
    public static void fadeIn(View view, long duration, long delay) {
        if (!enabled(view.getContext())) {
            view.setAlpha(1f);
            return;
        }
        view.setAlpha(0f);
        view.animate().alpha(1f).setStartDelay(delay)
                .setInterpolator(EMPHASIZED).setDuration(duration).start();
    }

    /** Плавное раскрытие/скрытие панели (эмодзи, ответ, запись). */
    public static void slidePanel(final View view, final boolean show) {
        if (show) {
            view.setVisibility(View.VISIBLE);
            if (!enabled(view.getContext())) {
                view.setAlpha(1f);
                view.setTranslationY(0f);
                return;
            }
            view.setAlpha(0f);
            view.setTranslationY(Ui.dp(view.getContext(), 18));
            view.animate().alpha(1f).translationY(0f)
                    .setInterpolator(EMPHASIZED).setDuration(190L).start();
        } else {
            if (!enabled(view.getContext())) {
                view.setVisibility(View.GONE);
                return;
            }
            view.animate().alpha(0f).translationY(Ui.dp(view.getContext(), 14))
                    .setInterpolator(EMPHASIZED).setDuration(140L)
                    .setListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animation) {
                            view.setVisibility(View.GONE);
                            view.setAlpha(1f);
                            view.setTranslationY(0f);
                        }
                    }).start();
        }
    }

    /** Подсветка «стекла» под пальцем: лёгкое сжатие и возврат. */
    public static void pressFeedback(final View view) {
        if (!enabled(view.getContext())) return;
        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getActionMasked()) {
                    case MotionEvent.ACTION_DOWN:
                        v.animate().scaleX(0.97f).scaleY(0.97f)
                                .setInterpolator(EMPHASIZED).setDuration(90L).start();
                        break;
                    case MotionEvent.ACTION_UP:
                    case MotionEvent.ACTION_CANCEL:
                        v.animate().scaleX(1f).scaleY(1f)
                                .setInterpolator(BOUNCE).setDuration(190L).start();
                        break;
                    default:
                        break;
                }
                return false;
            }
        });
    }

    /** Пульсация (точка записи, индикатор ожидания). */
    /** Короткая пульсация — «обрати на меня внимание» (по умолчанию 700 мс). */
    public static void pulse(final View view) {
        pulse(view, 700L);
    }

    public static void pulse(final View view, final long periodMs) {
        if (!enabled(view.getContext())) return;
        final ValueAnimator animator = ValueAnimator.ofFloat(0f, 1f);
        animator.setDuration(periodMs);
        animator.setRepeatCount(ValueAnimator.INFINITE);
        animator.setRepeatMode(ValueAnimator.REVERSE);
        animator.addUpdateListener(a -> {
            float t = (float) a.getAnimatedValue();
            view.setAlpha(0.45f + 0.55f * t);
            float scale = 0.85f + 0.25f * t;
            view.setScaleX(scale);
            view.setScaleY(scale);
        });
        animator.start();
    }

    /** Мягкий «дыхательный» вход для аватара и заголовка. */
    public static void breathing(View view) {
        if (!enabled(view.getContext())) return;
        ValueAnimator animator = ValueAnimator.ofFloat(1f, 1.03f);
        animator.setDuration(2400L);
        animator.setRepeatCount(ValueAnimator.INFINITE);
        animator.setRepeatMode(ValueAnimator.REVERSE);
        animator.addUpdateListener(a -> {
            float v = (float) a.getAnimatedValue();
            view.setScaleX(v);
            view.setScaleY(v);
        });
        animator.start();
    }

    /** Вибрация-отклик: разные типы для разных действий. */
    public static void haptic(View view, boolean strong) {
        try {
            view.performHapticFeedback(strong
                    ? HapticFeedbackConstants.LONG_PRESS
                    : HapticFeedbackConstants.KEYBOARD_TAP);
        } catch (Throwable ignored) {
        }
    }

    /** Покачивание при ошибке (неверный жест, отказ). */
    public static void shake(View view) {
        if (!enabled(view.getContext())) return;
        android.view.animation.TranslateAnimation shake =
                new android.view.animation.TranslateAnimation(0, Ui.dp(view.getContext(), 6), 0, 0);
        shake.setDuration(60L);
        shake.setRepeatCount(3);
        shake.setRepeatMode(android.view.animation.Animation.REVERSE);
        view.startAnimation(shake);
    }
}
