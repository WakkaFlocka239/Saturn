package gg.projecteden.saturn.utils;

@FunctionalInterface
public interface UncheckedConsumer<T> {
	void accept(T var1) throws Exception;
}
