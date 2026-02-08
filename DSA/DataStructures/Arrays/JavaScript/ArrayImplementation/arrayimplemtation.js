class ArrayImplementation {
    constructor(...items) {
        this.store = {};
        const len = items.length;

        for(let i = 0; i < len; i++) {
            this.store[i] = items[i];
            this.length = len;
        }
    }

    get(index) {
        return this.store[index];
    }

    push(...items) {
        for(let i = 0; i < items.length; i++) {
            this.store[this.length++] = items[i];
        }
    }

    pop() {
        delete this.store[--this.length];
    }

    shift() {
        for(let i = 1; i < this.length; i++) {
            this.store[i-1] = this.store[i];
        }
        this.pop();
    }

    unShift(...items) {
        const paramsLength = items.length;
        const newStore = {};
        for(const [key, value] of Object.entries(this.store)) {
            const newKey = parseInt(key) + paramsLength;
            newStore[newKey] = value;
        }
        for(let i = 0; i < items.length; i++) {
            newStore[i] = items[i];
        }
        this.length +=  paramsLength;
        this.store = newStore;
    }
}




