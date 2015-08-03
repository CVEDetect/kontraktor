package org.nustaq.reallive.newimpl;

/**
 * Created by moelrue on 03.08.2015.
 */
public class RemoveMessage<K> implements ChangeMessage<K,Record> {
     K key;

    @Override
    public int getType() {
        return REMOVE;
    }

    @Override
    public K getKey() {
        return key;
    }
}
