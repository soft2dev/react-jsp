const Component = () => {
    const [count, setCount] = React.useState(0);
    return(
        <div>
            <h1>Counter: {count}</h1>
            <button onClick={() => {setCount(count+1)}}>Increase</button>
            <button onClick={() => {setCount(count-1)}}>Decrease</button>
        </div>
    )
} 