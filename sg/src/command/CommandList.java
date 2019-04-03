package command;

public enum CommandList {

	LEFT
	{
		public Command getKey()
		{
			return new LeftKey();
		}
	},
	UP
	{
		public Command getKey()
		{
			return new UpKey();
		}
	},
	RIGHT
	{
		public Command getKey()
		{
			return new RightKey();
		}
	},
	DOWN
	{
		public Command getKey()
		{
			return new DownKey();
		}
	},
	STOP
	{
		public Command getKey()
		{
			return new StopKey();
		}
	};
	
	public abstract Command getKey();
}
