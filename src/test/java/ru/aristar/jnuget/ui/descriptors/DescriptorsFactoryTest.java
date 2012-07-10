package ru.aristar.jnuget.ui.descriptors;

import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;
import static org.junit.Assert.*;
import ru.aristar.jnuget.sources.ClassicPackageSource;
import ru.aristar.jnuget.sources.push.SimplePushStrategy;

/**
 * Тесты фабрики дескрипторов классов
 *
 * @author sviridov
 */
public class DescriptorsFactoryTest {

    /**
     * Проверка получения дескриптора источника пакетов
     */
    @Test
    public void testGetPackageSourceDescriptor() {
        //GIVEN
        DescriptorsFactory descriptorsFactory = DescriptorsFactory.getInstance();
        //WHEN
        ObjectDescriptor descriptor = descriptorsFactory.getPackageSourceDescriptor(ClassicPackageSource.class);
        //THEN
        assertThat(descriptor, is(not(nullValue())));
        assertThat(descriptor, is(instanceOf(ClassicPackageSourceDescriptor.class)));
    }

    /**
     * Проверка получения дескриптора стратегии фиксации
     */
    @Test
    public void testGetPushStrategyDescriptor() {
        //GIVEN
        DescriptorsFactory descriptorsFactory = DescriptorsFactory.getInstance();
        //WHEN
        ObjectDescriptor descriptor = descriptorsFactory.getPushStrategyDescriptor(SimplePushStrategy.class);
        //THEN
        assertThat(descriptor, is(not(nullValue())));
        assertThat(descriptor, is(instanceOf(SimplePushStrategyDescriptor.class)));
    }
}
